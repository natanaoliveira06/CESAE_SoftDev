@extends('layout.femaster')
@section('content')

<div class="section_title">
  <h2 class="secondary_title">Update Album</h2>
</div>
<div class="container-form">  
<form method="POST" action="{{route('album.update', ['id' => $album->id]) }}" enctype="multipart/form-data">
  @csrf 
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Name *</label>
      <input type="text"  value="{{ $album -> albumName}}"  name="albumName" class="form-control" id="inputLine" required>
      @error('albumName')
      <div class="alert alert-danger">
          Invalid name
      </div> 
      @enderror
    </div>
      <div class="form-group col-md-6">
        <label for="cover" style="padding-bottom: 5px">Cover album *</label>
        <input accept="image/*" type="file" name="cover" class="form-control" id="cover" required>
      </div>
    </div>

    <div class="row row-form">
      <div class="form-group col-md-6">
        <label for="exampleFormControlInput1" class="form-label">Release Year *</label>
        <input type="number" value="{{ $album -> dateRelease}}" name="dateRelease" class="form-control" id="inputLine" required>
        @error('dateRelease')
        <div class="alert alert-danger">Invalid year</div>
        @enderror
      </div>
      <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Band *</label>         
        <select id="inputLine" name="bands_id" class="form-control" required>
          <option selected>Select...</option>
          @foreach ($bands as $band)
          {{-- o @if vai buscar a banda que já está selecionada --}}
          <option value="{{ $band->id }}" @if($band->id == $album->bands_id) selected @endif>{{ $band->name }} </option>
          @endforeach   
        </select>        
      </div>
    </div>
    <div class="d-flex justify-content-end confirmation-button">
      <button type="submit" class="btn btn-primary-purple">Update</button>
    </div>
</form>
</div>
@endsection
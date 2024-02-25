@extends('layout.femaster')
@section('content')

<div class="section_title">
  <h2 class="secondary_title">Update band</h2>
</div>
<div class="container-form">  
<form method="POST" action="{{ route('band.update', ['id' => $band->id]) }}" enctype="multipart/form-data">
  @csrf 
  <input type="hidden" name="id" value="{{ $band->id }}" id=""> 
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Name *</label>
      <input type="text" value="{{ $band -> name}}" name="name" class="form-control" id="inputLine" required>
      @error('name')
      <div class="alert alert-danger">
          Invalid name
      </div> 
      @enderror
    </div>
  <div class="form-group col-md-6">
    <label for="photo" style="padding-bottom: 1px">Band photo *</label>
    {{-- input da imagem --}}
    <input accept="image/*" type="file" name="photo" class="form-control mt-2" id="photo" 
      @if($band->photo)       {{-- Se tiver uma foto, mantem o caminho da atual  --}}
        value="{{ $band->photo }}"
      @endif>
    @if($band->photo) <!-- ainda com uma foto mostra a imagem atual na tela -->
    <p style="color: #9C44D8; padding-top: 5px">Current Image</p>
    <img src="{{ asset('storage/' . $band->photo) }}" alt="Current Image" style="max-width: 50px;">
    @else <!-- Se não houver imagem mostra a mensagem-->
      <p style="color: #9C44D8; padding-top: 5px"><i class="bi bi-image"></i> No current photo available</p>
    @endif 
  </div> 
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Origin *</label>
      <input type="text" value="{{ $band -> origin}}" name="origin" class="form-control" id="inputLine" required>
      @error('origin')  
      <div class="alert alert-danger">
          Invalid origin
      </div> 
      @enderror
    </div>
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Genre *</label>
      <input type="text" value="{{ $band -> genre}}" name="genre" class="form-control" id="inputLine" required>
      @error('genre')  
      <div class="alert alert-danger">
          Invalid genre
      </div> 
      @enderror
    </div>
  </div>
  <div class="row row-form">
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Year of formation *</label>
      <input type="number" value="{{ $band -> yearFormation}}" name="yearFormation" class="form-control" id="inputLine" required>
      @error('yearFormation')  
      <div class="alert alert-danger">
          Invalid year
      </div> 
      @enderror
    </div>
    <div class="form-group col-md-6">
      <label for="exampleFormControlInput1" class="form-label">Number of albums *</label>
      <input type="number" value="{{ $band -> num_albuns}}" name="num_albuns" class="form-control" id="inputLine" required>
      @error('num_albuns')  
      <div class="alert alert-danger">
          Invalid number
      </div> 
      @enderror
    </div>
  </div>
  <div class="d-flex justify-content-end confirmation-button">
  <button type="submit" class="btn btn-primary-purple">Update</button>
</div>
</form>
</div>
@endsection
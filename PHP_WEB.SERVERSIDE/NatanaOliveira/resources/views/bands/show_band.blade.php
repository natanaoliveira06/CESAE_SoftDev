@extends('layout.femaster')
@section('content')
<div class="container">

<div class="section_title">
  <h2 class="secondary_title">Band Details</h2>
</div>
<div class="container-form">  
  <form method="POST" action="{{route('band.show', ['id' => $band->id]) }}" enctype="multipart/form-data">
    @csrf 
    <div class="row">
      <div class="col-md-6">
        <div class="d-flex justify-content-center align-items-center">
        <div class="form-group" style="margin-bottom: 25px">
          @if($band->photo)     
          <img src="{{ asset('storage/' . $band->photo) }}" alt="Album Cover" style="max-width: 300px;">
          @endif 
        </div>
      </div>
      </div>      
      <div class="col-md-6">
        <div class="row row-form">
          <div class="form-group col-md-12">
            <label for="exampleFormControlInput1" class="form-label">Name</label>
            <input type="text"  value="{{ $band->name }}"  name="albumName" class="form-control" id="inputLine" disabled>
          </div>
        </div>
        <div class="row row-form">
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Origin</label>
            <input type="text"value="{{ $band->origin }}" name="origin" class="form-control" id="inputLine" disabled>
          </div>
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Genre</label>
            <input type="text" value="{{ $band->genre }}" name="genre" class="form-control" id="inputLine" disabled>
          </div>
        </div>
        <div class="row row-form">
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Year of formation</label>
            <input type="number" value="{{ $band->yearFormation }}" name="yearFormation" class="form-control" id="inputLine" disabled>
          </div>
          <div class="form-group col-md-6">
            <label for="exampleFormControlInput1" class="form-label">Number of albums *</label>
            <input type="number" value="{{ $band->num_albuns }}" name="num_albuns" class="form-control" id="inputLine" disabled>
          </div>
        </div>
      </div>
    </div>
  </form>
</div>
</div>
@endsection
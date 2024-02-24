@extends('layout.femaster')
@section('content')

<div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col">
    <div class="card">
      <img src="{{ asset('images/music-band.png') }}" class="card-img-top" alt="" width="20%">
      <div class="card-body">
        <h5 class="card-title">BANDS</h5>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="{{ asset('images/vinyl-record.jpg') }}" class="card-img-top" alt="" width="20%">
      <div class="card-body">
        <h5 class="card-title">ALBUNS</h5>
      </div>
    </div>
  </div>
</div>

@endsection
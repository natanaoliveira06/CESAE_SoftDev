@extends('layout.femaster')
@section('content')
@auth

<div class="container">  
  <h3 class="secondary_title" style="margin-bottom: 25px">Welcome, {{ Auth::user ()->name}}! </h3>  {{-- aparece o nome do usuário --}}
  
  <div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col d-flex justify-content-center">
    <a class="card-link" href="{{ route('bands.all') }}">      {{-- name nas rotas --}}
      <div class="card text-bg-dark text-center align-middle" style="padding: 0; max-width: 450px">
     <img src="{{ asset('images/music-band.png') }}" class="card-img-top" alt="">
     <div class="card-img-overlay">
       <h5 class="card-title" style="font-size: 32px; font-weight: 600;">BANDS</h5>
     </div>
   </div>
  </a>
  </div>
  <div class="col">
    <a class="card-link" href="{{ route('album.all') }}">      {{-- name nas rotas --}}
     <div class="card text-bg-dark text-center align-middle" style="padding: 0; max-width: 450px">
    <img src="{{ asset('images/vinyl-record.jpg') }}" class="card-img-top" alt="">
    <div class="card-img-overlay">
      <h5 class="card-title" style="font-size: 32px; font-weight: 600;">ALBUNS</h5>
    </div>
  </div>   
    </a>
  </div>  
</div>
</div>







@endauth
@endsection


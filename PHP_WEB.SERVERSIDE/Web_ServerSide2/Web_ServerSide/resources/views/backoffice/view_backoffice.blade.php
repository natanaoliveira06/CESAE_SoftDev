@extends('layout.femaster')
@section('content')

<br>
<h2>BackOffice</h2>
<br><br>

<h3>Olá, {{ Auth::user ()->name}}!</h3>  {{-- aparece o nome do usuário --}}
<br>

@auth  {{-- quando o user for autenticado --}}
 @if(Auth::user()->user_typer == 1 )  {{-- e for do tipo 1 (ADM - definido na base de dados) --}}

 <div class="alert alert-info" role="alert">
  Conta de Administrador
</div>
@endif
@endauth

@endsection
@extends('layout.femaster')
@section('content')

<br>
<br>
<h2>Adicionar tarefa</h2>
<br>
<div class="container">
    <form method="POST" action="{{ route('tasks.create') }}">
        @csrf  {{-- Token para impedir o sql injection, não é necessário usar --}}
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
            <input type="texto" value="{{ old('name') }}" name="name" class="form-control"
                id="exampleFormControlInput1" placeholder="Nome" required>
            @error('name')
                <div class="alert alert-danger">
                    Tarefa inválida
                </div>
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Descrição</label>
            <input value="{{ old('description') }}" type="text" name="description" class="form-control"
                id="exampleFormControlInput1">
        </div>
        <div class="mb-3">
          <label for="exampleFormControlInput1" class="form-label">User ID</label>
          <select name="user_id" id="">
              @foreach ($users as $user)
                  <option value="{{ $user->id }}">
                      {{ $user->name }} </option>
              @endforeach
            </select>
          </div>
          <button type="submit" class="btn btn-primary">Enviar</button>
      </form>
      <br>
      <a class= "btn btn-success" href="{{ route('home.index') }}">Voltar</a>
      <br>
      <br>
      </div>
@endsection
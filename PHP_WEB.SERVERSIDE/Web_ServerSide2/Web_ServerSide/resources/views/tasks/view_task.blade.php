@extends('layout.femaster')
@section('content')

<br>
<br>
   <h2>Ver / Atualizar Tarefa {{$myTask->name}}</h2>
   <br>

<form method="POST" action="{{route('tasks.update')}}">
    @csrf   {{-- um helper de validação do Laravel. antes do código receber dados funciona como barreira     --}}
    <input type="hidden" name="id" value="{{ $myTask->id }}" id="">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Tarefa</label>
        <input type="texto" value="{{ $myTask ->name}}" name="name" class="form-control" id="exampleFormControlInput1" placeholder="Nome" required>       
        @error('name')  
        <div class="alert alert-danger">
            A tarefa que inseriu é invalida.  
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
                <option value="{{ $user->id }}" @if($user->id == $myTask->user_id) 
                    selected @endif>
                    {{ $user->name }}
                </option>
            @endforeach
        </select>


        </div>
        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
    <br>
    <a class= "btn btn-success" href="{{ route('home.index') }}">Voltar</a>
    <br>
    <br>
    </div>
@endsection
@extends('layout.femaster')
@section('content')


    <h3>All users:</h3>
{{--
    <p>{{$hello}}</p>
    <p>{{$helloAgain}}</p>
    <p>{{$daysOfWeek[2]}}</p>

    <p>{{$courseInfo['name']}}</p>
    <p>{{$courseInfo['modules'][0]}}</p>
    <p>{{$courseInfo[0][3]}}</p> --}}


<ul>
    <table class="table">
        <thead>
            <tr><h5>Dados do Formadores: </h5></tr>
          <tr>
            <th scope="col">id</th>
            <th scope="col">Name</th>
            <th scope="col">Phone</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($usersContacts as $item)
            <tr>
                <td scope="row">{{$item['id']}}</td>
                <td>{{$item['name']}}</td>
                <td>{{$item['phone']}}</td>
            </tr>
            @endforeach

        </tbody>
      </table>
</ul>

@endsection

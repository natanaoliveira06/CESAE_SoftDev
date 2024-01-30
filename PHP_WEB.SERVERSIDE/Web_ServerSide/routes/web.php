<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\UserController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

Route::get('/', function () {
    return view('welcome');
})->name('bemvindos');

Route::get('/home', [IndexController::class, 'index'])->name('home.index');


Route::get('/ola', function () {  //nome do frontEnd
    return '<h1>Hello Turma de Software</h1>'; //nome da view
})->name('home.hello'); // caminho para chamar a rota


Route::get('/hello/{nome}', function ($nome) {
    return '<h1>Hello Turma de Software</h1>'.$nome;
});

// rotas de user

Route::get('/users/add', [UserController::class, 'addUser'])->name('users.add');

Route::get('/users/all',  [UserController::class, 'allUsers'])->name('users.all');


Route::fallback(function () {
    return view("main.fallback"); //não é preciso criar name para fallback porque ela é sempre chamado quando a pagina não é encontrada
});

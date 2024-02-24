<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AdminController;
use App\Http\Controllers\IndexController;

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
});

//main view
Route::get('/home', [IndexController::class, 'index'])->name('home.index');



// ---------------------------- ::: ADMINISTRADOR ::: ---------------------------------------
// ---------- DASHBOARD ----------
Route::get('admin/dashboard', [AdminController::class, 'viewAdmin'])->name('admin.view');
// ------------ BANDAS ------------
Route::get('/admin/bands', [AdminController::class, 'bandsViewAdmin'])->name('admin.bands');
Route::get('/admin/bands/view{id}', [AdminController::class, 'viewBands'])->name('bands.view');
//Adicionar nova banda
Route::get('/admin/bands/addBand', [AdminController::class, 'addBand'])->name('band.add');
Route::post('/admin/bands/createBand', [AdminController::class, 'createBand'])->name('band.create');
//Atualizar banda
Route::post('/admin/bands/update/{id}', [AdminController::class, 'updateBand'])->name('band.update');
//Apagar banda
Route::get('/admin/bands/delete/{id}', [AdminController::class, 'deleteBand'])->name('band.delete');


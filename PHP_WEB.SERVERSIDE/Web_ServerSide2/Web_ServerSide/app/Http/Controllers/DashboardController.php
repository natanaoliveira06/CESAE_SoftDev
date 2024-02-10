<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class DashboardController extends Controller
{
   
    public function backOfficeView(){

      return view('backoffice.view_backoffice');
    }
}

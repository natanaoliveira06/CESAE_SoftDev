<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class AdminController extends Controller
{
    public function viewAdmin()
    {
        // $admin = $this->getAdmin();
        // return view('admin.admin', compact('admin'));
        return view('admin.admin');
    }

}

<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{

    public function allTasks(){

        $tasks = $this->getTasks();

      //  dd($tasks);

        return view('/tasks/all_tasks', compact ('tasks'));
    }

    public function getTasks(){        
        $tasks = DB::table('tasks')
        ->join('users', 'user_id', '=', 'users.id')
        ->select('tasks.*', 'users.name as usname')        
        -> get();

        return $tasks;
    }
 
}

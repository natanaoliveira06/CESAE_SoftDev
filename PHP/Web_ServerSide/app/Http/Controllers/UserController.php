<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function addUser(){
        return view('users.add_user');
    }


    public function allUsers(){

        $hello = 'Finalmente vamos para código'; // declarar uma variável
        $helloAgain = 'cucu';

        $daysOfWeek = $this->getDaysOfWeek();
        $courseInfo = $this->infoCourse();
        $usersContacts = $this->getContacts();

       // dd($courseInfo); //debug
      // var_dump($courseInfo); //debug


       return view('users.all_user', compact('hello',
       'helloAgain',
       'daysOfWeek','courseInfo', 'usersContacts')); //
    }


    private function getDaysOfWeek(){

        $daysOfWeek = ['Segunda','Terça', 'Quarta', 'Quinta', 'Sexta'];
        return $daysOfWeek;

    }

    private function infoCourse(){
        $courseInfo = [ // Array Associativo pode ter outro array dentro e é com keys
            'name' => 'Software Developer',
            'year' => 2024,
            'modules' => ['PHP', 'Webservices', 'Java'],
            ['Teste', 4,'Sofia', 'João'] // array sem key
        ];
         return $courseInfo;
    }


    protected function getContacts(){
        $contacts = [
            ['id' => 1, 'name' => 'Sara', 'phone'=> '985654455'],
            ['id' => 2, 'name' => 'Bruno', 'phone'=> '985654455'],
            ['id' => 3, 'name' => 'Márcia', 'phone'=> '985654455'],
        ];
        return $contacts;
    }



}

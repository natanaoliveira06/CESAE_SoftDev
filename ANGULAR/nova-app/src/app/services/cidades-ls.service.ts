import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {
  cidades: Array<ICidade> = [];

  constructor() {
    console.log(
      'localStorage.getItem("cidades")', 
      localStorage.getItem('cidades')
      );
    
    if(!localStorage.getItem('cidades')){
    this.reporDados();
    } else {
      this.readAll();
    }
   }

   limparDados():void {
    // localStorage.clear(); // todos os dados
    localStorage.removeItem('cidades');
    this.cidades = []; //limpar o array de cidades

    this.reporDados();   //refazer os dados
   }

   reporDados():void {
    let cidades: Array<ICidade> = [
      {id: 1, nome: 'Porto', pais: 'Portugal', populacao: 78450},
      {id: 2, nome: 'Aveiro', pais: 'Portugal', populacao: 181494},
      {id: 3, nome: 'Barcelona', pais: 'Espanha', populacao: 1620343},
      {id: 4, nome: 'Paris', pais: 'França', populacao: 2148271},
      {id: 5, nome: 'Berlim', pais: 'Alemanha', populacao: 3645000}
    ];

    this.cidades = cidades;
    localStorage.setItem('cidades', JSON.stringify(cidades));
   }

   //crud
   create(novaCidade: ICidade): void {
 
    /*let maxID: number = 0;  
    for (const item of this.cidades) {  //for each
      if (maxID < item.id) {
        maxID = item.id;
      }
    }*/
 
    /*let maxID: number = 0;
    this.cidades.forEach((item) => {
      if (maxID < item.id) {
        maxID = item.id;
      }
    });*/
 
    /*const maxID: number = this.cidades.reduce(
      (maxID, item) => {
        maxID > item.id ? ///////.3......................
      }
    );*/
 
    /*const max: ICidade = this.cidades.reduce(
      function name(max: ICidade, item: ICidade): ICidade {
        if(max.id > item.id) {
          return max;
        }
        else{
          return item;
        }
      }
    );*/
 
    const maxID: ICidade = this.cidades.reduce( //maxID e o objeto e nao so o ID
      (max, item) => max.id > item.id ? max : item //se der erro por causa do tipo de dados: (max: ICidade, item: ICidade)
    );
   
    novaCidade.id = maxID.id + 1;
 
    this.cidades.push(novaCidade);
    localStorage.setItem('cidades', JSON.stringify(this.cidades));
 
    console.log(this.cidades); // --
  }
 

  readAll():void { // busca os dados atualizados, no construtor ficam os dados de inicialização
    let cidades: Array<ICidade> = JSON.parse
    (localStorage.getItem('cidades') || '');

    this.cidades = cidades;
  }

  read(id: number): ICidade { // ler apenas um
    return this.cidades.filter(x => x.id === id)[0]; //ele retorna uma lista e so queremos a primeira posicao
  }

  update(cidade: ICidade):void{ //precisa do objeto completo como parametro
   let index: number = this.cidades.findIndex((x: ICidade) => x.id === cidade.id);
   this.cidades[index] = cidade;

   localStorage.setItem('cidades', JSON.stringify(this.cidades));
  }

  delete(cidade: ICidade):void{

  }
}

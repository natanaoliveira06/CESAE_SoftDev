import { Injectable } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Injectable({
  providedIn: 'root'
})
export class CidadesService {
  cidades: Array<ICidade> = [
    {id: 0, nome: 'Porto', pais: 'Portugal', populacao: 78450},
    {id: 1, nome: 'Aveiro', pais: 'Portugal', populacao: 181494},
    {id: 2, nome: 'Barcelona', pais: 'Espanha', populacao: 1620343},
    {id: 3, nome: 'Paris', pais: 'França', populacao: 2148271},
    {id: 4, nome: 'Berlim', pais: 'Alemanha', populacao: 3645000}
  ];

  constructor() { }

  create(novaCidade: ICidade) {
    this.cidades.push(novaCidade);
  }
}

import { Component, Input } from '@angular/core';
import { ICidade } from '../models/cidade.model';

@Component({
  selector: 'app-minha-lista-item',
  standalone: true,
  imports: [],
  templateUrl: './minha-lista-item.component.html',
  styleUrl: './minha-lista-item.component.scss'
})
export class MinhaListaItemComponent {
  // @Input({required: true}) cidade: string = '';
  @Input({required: true}) cidade: ICidade = {nome: '', pais: '', populacao: 0};
}

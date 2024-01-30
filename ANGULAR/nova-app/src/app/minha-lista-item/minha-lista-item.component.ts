import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-minha-lista-item',
  standalone: true,
  imports: [],
  templateUrl: './minha-lista-item.component.html',
  styleUrl: './minha-lista-item.component.scss'
})
export class MinhaListaItemComponent {
  @Input({required: true}) cidade: string = '';

}

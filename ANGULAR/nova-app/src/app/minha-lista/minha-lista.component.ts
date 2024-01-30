import { Component } from '@angular/core';
import { MinhaListaItemComponent } from '../minha-lista-item/minha-lista-item.component';

@Component({
    selector: 'app-minha-lista',
    standalone: true,
    templateUrl: './minha-lista.component.html',
    styleUrl: './minha-lista.component.scss',
    imports: [MinhaListaComponent, MinhaListaItemComponent]
})
export class MinhaListaComponent {
  cidades: Array<string> = [
    "Porto",
    "Aveiro",
    "Barcelona",
    "Paris",
    "Edimburgo",
    "Londres"
  ];

}



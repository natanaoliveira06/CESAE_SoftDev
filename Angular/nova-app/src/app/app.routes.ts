import { Routes } from '@angular/router';
import { SegundaPagComponent } from './segunda-pag/segunda-pag.component';
import { PrimeiraPagComponent } from './primeira-pag/primeira-pag.component';
import { SegundaAaaComponent } from './segunda-aaa/segunda-aaa.component';
import { SegundaBbbComponent } from './segunda-bbb/segunda-bbb.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { MinhaListaComponent } from './minha-lista/minha-lista.component';
import { ListaAnimaisComponent } from './lista-animais/lista-animais.component';

export const routes: Routes = [
  {
    path: 'primeira',
    title: 'Primeira Página',
    component: PrimeiraPagComponent,
  },
  {
    path: 'segunda',
    title: 'Segunda Página',
    component: SegundaPagComponent,
    children: [
      {
        path: 'segunda-aaa',
        title: 'Segunda Página AAA',
        component: SegundaAaaComponent,
      },
      { path: 'segunda-bbb', component: SegundaBbbComponent },
    ],
  }, 
  {
    path: 'minha-lista', 
    title: 'Minha Lista', 
    component: MinhaListaComponent,
  },

  {
    path: 'lista-animais', 
    title: 'Lista Animais', 
    component: ListaAnimaisComponent,
  },

  
  { path: '', redirectTo: '/primeira', pathMatch: 'full'}, // aparece: "link.com/primeira"
  //  OU 
  // { // aparece: "link.com/"
  //   path: '',
  //   title: 'Primeira Página',
  //   component: PrimeiraPagComponent,
  // }
  { path: '**', title: '404 - Página não encontrada', component: NotFoundComponent, }
];

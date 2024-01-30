import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-meu-componente',
  standalone: true,
  imports: [],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss',
})
export class MeuComponenteComponent {
  //  @Input({ required: true }) meuNome = 'Natana';
  // @Input({ alias: 'meu-nome' }) meuNome = 'Natana';
  @Input('meu-nome') meuNome: string = 'Natana';
  mensagem = 'Adoro doces! 🧁 ';
  imagem1 =
    'https://saborecia.com.br/wp-content/uploads/2020/08/MG_4421-scaled.jpg';

  @Output() mudancaContador: EventEmitter<number> = new EventEmitter<number>();
  contador: number = 0;

  imagens: string[] = [
    'https://saborecia.com.br/wp-content/uploads/2020/08/MG_4421-scaled.jpg',
    'https://s2-receitas.glbimg.com/mB4Q7uHW7J-XujkwuTAT4_fEgkE=/0x0:652x408/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_e84042ef78cb4708aeebdf1c68c6cbd6/internal_photos/bs/2020/7/9/jeDVVATiAdAVd6CxfAZg/mousse-de-chocolate.jpg',
    'https://cdn0.casamentos.com.br/vendor/8920/3_2/640/jpg/opcoes-de-doces-para-substituir-o-bem-casado-pao-de-mel-para-casamentos_13_268920-158169604631284.webp',
  ];

  obj: {} = {
    id: 80,
    nome: 'natana',
  };

  pCorTexto: string = '#336699';
  pCorFundo: string = '#99ccff';
  pAlterarCores: boolean = true;

  alterarImagem(): void {
    this.imagem1 = this.imagens[1];
  }

  alterarImagem2(): void {
    this.imagem1 =
      'https://cdn0.casamentos.com.br/vendor/8920/3_2/640/jpg/opcoes-de-doces-para-substituir-o-bem-casado-pao-de-mel-para-casamentos_13_268920-158169604631284.webp';
  }

  alterarCores(): void {
    let cor: string = this.pCorTexto;
    this.pCorTexto = this.pCorFundo;
    this.pCorFundo = cor;
  }

  alterarAtivo(): void {
    this.pAlterarCores = false;
  }

  incrementar(): void {
    this.contador++;
    this.mudancaContador.emit(this.contador);
  }
}

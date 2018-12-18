import { Component, OnInit } from '@angular/core';

import { Extratos } from '../extratos/extratos.service';

@Component({
  selector: 'app-extrato-lancamento-conta',
  templateUrl: './extrato-lancamento-conta.component.html',
  styleUrls: ['./extrato-lancamento-conta.component.css']
})
export class ExtratoLancamentoContaComponent implements OnInit {

  extrato: Array<any>;

  constructor(private extratosService: Extratos ) { }

  ngOnInit() {
    this.extratosService.listar()
      .subscribe(res => this.extrato = res.data.listaControleLancamento);
      //alert(extratos.totalControleLancamento.valorLancamentos);
  }

}

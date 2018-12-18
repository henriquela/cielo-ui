import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtratoLancamentoContaComponent } from './extrato-lancamento-conta.component';

describe('ExtratoLancamentoContaComponent', () => {
  let component: ExtratoLancamentoContaComponent;
  let fixture: ComponentFixture<ExtratoLancamentoContaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExtratoLancamentoContaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtratoLancamentoContaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

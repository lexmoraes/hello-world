class Pessoa {
  nome: string;
  idade: number;

  constructor(nome: string, idade: number) {
    this.nome = nome;
    this.idade =;
  }

  saudar(pessoa: Pessoa): string {
    return 'Olá, meu nome é ${this.nome} e eu tenho ${this.idade} anos.'
  }
}

const pessoa = new Pessoa('João', 25);
console.log(pessoa.saudar());

'''Declaração com tipagens'''
let nome: string = 'Alice';
let idade: number = 30;
let ativo: boolean = true;

'''Funções com tipagens'''
function saudar(pessoa: Pessoa): string {
}

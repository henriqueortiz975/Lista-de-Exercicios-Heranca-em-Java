# Lista de Exercícios – Herança em Java

---

## Exercício 1 — Classe Pessoa e Classe Aluno

Crie uma classe chamada **Pessoa** com os seguintes atributos privados:

- `nome`
- `idade`

Implemente os métodos **getters e setters** para ambos os atributos.

Depois crie uma classe chamada **Aluno** que **herde de Pessoa** e possua:

- `matricula`
- `curso`

Crie os métodos **getters e setters**.

No método `main`:

1. Crie um objeto da classe **Aluno**
2. Defina valores para todos os atributos
3. Mostre os dados na tela

---

## Exercício 2 — Sistema de Funcionários

Crie uma classe chamada **Funcionario** contendo:

- `nome`
- `salario`

Os atributos devem ser **privados** e acessados por **get e set**.

Depois crie uma classe chamada **Gerente** que **herda de Funcionario** e adicione:

- `departamento`

No `main`:

1. Crie um objeto **Gerente**
2. Defina nome, salário e departamento
3. Exiba todos os dados

---

## Exercício 3 — Animais

Crie uma classe chamada **Animal** com:

- `nome`
- `idade`

Implemente os métodos **get e set**.

Depois crie duas classes que **herdam de Animal**:

- **Cachorro**
- **Gato**

Cada classe deve possuir um método:

- `emitirSom()`

No `main`:

1. Crie um objeto **Cachorro**
2. Crie um objeto **Gato**
3. Defina nome e idade
4. Chame o método `emitirSom()`

---

## Exercício 4 — Veículos

Crie uma classe chamada **Veiculo** com:

- `marca`
- `modelo`
- `ano`

Implemente os **getters e setters**.

Crie duas classes que herdam de **Veiculo**:

- **Carro**
- **Moto**

Adicione os atributos:

Carro:

- `numeroPortas`

Moto:

- `cilindradas`

No `main`, crie um objeto de cada classe e exiba todos os dados.

---

## Exercício 5 — Sistema Escolar

Crie uma classe chamada **Pessoa** com:

- `nome`
- `cpf`

Depois crie duas classes que **herdam de Pessoa**:

**Professor**

- `disciplina`

**Aluno**

- `matricula`

Todos os atributos devem possuir **get e set**.

No `main`:

1. Crie um **Professor**
2. Crie um **Aluno**
3. Exiba todas as informações

---

## Exercício 6 — Produtos

Crie uma classe chamada **Produto** contendo:

- `nome`
- `preco`

Depois crie duas subclasses:

**ProdutoEletronico**

- `voltagem`

**ProdutoAlimenticio**

- `dataValidade`

Utilize **encapsulamento com getters e setters**.

No `main`, crie objetos das duas classes e exiba seus dados.

---

## Exercício 7 — Conta Bancária

Crie uma classe chamada **ContaBancaria** contendo:

- `numeroConta`
- `saldo`

Depois crie duas subclasses:

**ContaCorrente**

- `limite`

**ContaPoupanca**

- `taxaRendimento`

Utilize **getters e setters** para acessar os atributos.

No `main`:

1. Crie uma conta corrente
2. Crie uma conta poupança
3. Exiba as informações

---

## Exercício 8 — Dispositivos

Crie uma classe chamada **Dispositivo** com:

- `marca`
- `modelo`

Depois crie duas subclasses:

**Celular**

- `memoria`

**Notebook**

- `processador`

Utilize **get e set** para acessar os atributos.

No `main` crie objetos das subclasses e mostre os dados.

---

## Exercício 9 — Sistema de Transporte

Crie uma classe chamada **Transporte** com:

- `capacidade`
- `velocidade`

Depois crie duas subclasses:

**Aviao**

- `companhiaAerea`

**Onibus**

- `numeroLinha`

Utilize **getters e setters**.

No `main`, crie os objetos e mostre seus dados.

---

## Exercício 10 — Sistema de Biblioteca

Crie uma classe chamada **ItemBiblioteca** com:

- `titulo`
- `anoPublicacao`

Depois crie duas subclasses:

**Livro**

- `autor`

**Revista**

- `edicao`

Utilize **encapsulamento com get e set**.

No `main`:

1. Crie um objeto **Livro**
2. Crie um objeto **Revista**
3. Mostre os dados.

---

💡 **Desafio** 

Crie um método chamado **`exibirDados()`** nas classes para mostrar todas as informações do objeto em vez de usar vários `System.out.println()` no `main`.

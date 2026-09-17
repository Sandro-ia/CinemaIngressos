# 🎬 CinemaIngressos

Projeto de estudo sobre **Herança e Polimorfismo** em Java, desenvolvido durante o Bootcamp da [DIO](https://dio.me).

O sistema modela diferentes tipos de ingresso de cinema, cada um com sua própria regra de cálculo de valor, usando os conceitos fundamentais de Orientação a Objetos.

---

## 📚 Sobre o projeto

Um cinema vende três tipos de ingresso:

| Tipo | Regra de cálculo |
|------|-------------------|
| **Ingresso comum** | Valor cheio, sem desconto |
| **Meia entrada** | 50% do valor do ingresso comum |
| **Ingresso família** | Valor multiplicado pelo número de pessoas, com **5% de desconto** quando o grupo tem **mais de 3 pessoas** |

Todos os ingressos guardam também o **nome do filme** e se a sessão é **dublada ou legendada**.

---

## 🏗️ Estrutura de classes

```
src/
├── Ingresso.java            Classe base: valor, filme, dublado/legendado
├── MeiaEntrada.java          Herda de Ingresso, sobrescreve o cálculo (50%)
├── IngressoFamilia.java      Herda de Ingresso, calcula pelo número de pessoas + desconto
└── Main.java                 Programa principal, cria e testa os ingressos
```

### `Ingresso`

Classe base da hierarquia. Contém:
- `valor`: preço base do ingresso
- `nomeFilme`: nome do filme da sessão
- `dublado`: `true` para dublado, `false` para legendado
- `valorReal()`: método que retorna o valor final do ingresso (nesta classe, é o próprio valor cheio)

### `MeiaEntrada extends Ingresso`

Sobrescreve `valorReal()` para retornar **metade** do valor informado.

### `IngressoFamilia extends Ingresso`

Adiciona o atributo `numeroPessoas` e sobrescreve `valorReal()` para:
1. Multiplicar o valor pelo número de pessoas.
2. Aplicar **5% de desconto** sobre o total quando `numeroPessoas > 3`.

### `Main`

Classe com o método `main`, usada para testar a criação dos ingressos e exibir o valor real de cada um no console.

---

## 🧠 Conceitos praticados

- **Herança**: `MeiaEntrada` e `IngressoFamilia` estendem `Ingresso`, reaproveitando atributos e comportamentos comuns.
- **Polimorfismo**: o método `valorReal()` é sobrescrito (`@Override`) em cada subclasse, e o Java decide em tempo de execução qual versão executar, mesmo quando o objeto é referenciado pelo tipo `Ingresso`.

---

## ▶️ Como executar

### Pré-requisitos

- [JDK](https://www.oracle.com/java/technologies/downloads/) instalado (versão 8 ou superior)

### Compilando e executando pelo terminal

```bash
cd src
javac *.java
java Main
```

### Executando pelo IntelliJ IDEA

1. Abra o projeto no IntelliJ.
2. Abra o arquivo `Main.java`.
3. Clique na seta verde ▶️ ao lado do método `main`, ou pressione `Shift + F10`.

---

## 💡 Exemplo de saída

```
Comum: 20.0
Meia: 10.0
Familia: 76.0
```

No exemplo acima:
- Ingresso comum de **R$ 20,00** → valor cheio.
- Meia entrada sobre **R$ 20,00** → **R$ 10,00** (metade).
- Ingresso família de **R$ 20,00** para **4 pessoas** → `20 × 4 = 80`, com 5% de desconto (grupo maior que 3) → **R$ 76,00**.

---

## 🚀 Tecnologias

- Java

---

## 👤 Autor

Desenvolvido por **Sandro** durante o Bootcamp da [DIO](https://dio.me).

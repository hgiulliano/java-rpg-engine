# ⚔️ Java RPG Combat Engine

Um motor tático via terminal para simulação e gestão de combates de RPG, construído inteiramente em Java. O projeto foi desenvolvido como um laboratório prático para consolidar fundamentos de Arquitetura de Software e Programação Orientada a Objetos (POO).

## 🚀 Tecnologias e Paradigmas
- **Linguagem:** Java 
- **Paradigma:** Orientação a Objetos pura
- **Conceitos Aplicados:**
  - **Ocultação de Informação e Encapsulamento:** Validação de regras de negócio (ex: limites de HP).
  - **Coleções Dinâmicas:** Utilização de `ArrayList` para gestão de sistema de *party*.
  - **Herança:** Reaproveitamento estrutural através de Superclasses e Subclasses (`extends` e `super`).
  - **Polimorfismo e Classes Abstratas:** Comportamentos dinâmicos de ataque sobrescritos via `@Override`.
  - **Interfaces e Late Binding:** Definição de contratos de comportamento múltiplo (`implements`) para ataques furtivos e mágicos.

## ⚙️ Como Executar
1. Clone o repositório: `git clone https://github.com/hgiulliano/java-rpg-engine.git`
2. Compile todos os ficheiros fonte: `javac *.java`
3. Inicie o motor tático: `java Main`
<h3 align="center">
  <img src="/TwoSum/Imagens_/TWOSUM_INICIAL.jpeg" width="100%">
</h3>
````markdown
<h1>
  <img src="./assets/leetcode-logo.png" width="35" align="center">
  Two Sum </h1>

**LeetCode:** #1  
**Difficulty:** Easy  
**Topic:** Array / Hash Map

## Problema

Dado um array de números inteiros `nums` e um valor `target`, encontre os **índices de dois números** cuja soma seja igual ao `target`.

### Exemplo
```text
nums = [2, 7, 11, 7]
target = 14

7 + 7 = 14

[2, 7, 11, 7]
    ↑       ↑
    1       3
````

Resultado:

```text
[1, 3]
```

## Como pensar

Para cada número, descubra qual número está faltando:
```text
complemento = target - número atual
```

Exemplo:

```text
target = 14
número atual = 7

14 - 7 = 7
```

Precisamos descobrir se esse complemento já apareceu.
Para isso, usamos um **Hash Map**:

```text
número → índice
```

Em Python, usamos `dict`.
Em Java, usamos `HashMap`.

## Estratégia

1. Percorrer o array.
2. Calcular o complemento.
3. Verificar se o complemento já está no Hash Map.
4. Se estiver, retornar os dois índices.
5. Caso contrário, armazenar o número e seu índice.

## Big-O

### Tempo

```text
O(n)
```

O array é percorrido e a busca no Hash Map possui custo médio `O(1)`.

### Espaço

```text
O(n)
```

O Hash Map pode armazenar até `n` elementos.

### Comparação

Força bruta:

```text
O(n²)
```

Hash Map:

```text
O(n)
```

A ideia é usar mais memória para evitar comparações desnecessárias.

## Arquivos

Depois de tentar resolver sozinho:

* `solution.py` → implementação em Python
* `Solution.java` → implementação em Java

Compare sua solução com elas e tente explicar **por que o Hash Map permite reduzir a complexidade de `O(n²)` para `O(n)`**.

## O que este exercício ensina

* Arrays e índices
* Complemento
* Hash Map / `dict`
* Relação `número → índice`
* Big-O
* Complexidade de tempo e espaço

> **Tente primeiro. Depois confira a solução.**
## Lógica:
```text
[Explicação visual do Two Sum](/TwoSum/solutiontwosum_python_java.txt)
```
<h3 align="center">
  <img src="/TwoSum/Imagens_/TWOSUM_FINAL.jpeg" width="100%">
</h3>

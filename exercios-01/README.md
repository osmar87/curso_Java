# Simulador de Abertura de Conta

Este projeto é um **simulador de abertura de contas bancárias**, permitindo criar usuários e contas, associando informações pessoais a contas correntes com saldo inicial.  

---

## Classes

### 1. `User`

Representa um usuário do sistema.

**Atributos:**

| Atributo   | Tipo   | Descrição |
|------------|--------|-----------|
| `id`       | UUID   | Identificador único gerado automaticamente |
| `nome`     | String | Nome completo do usuário |
| `cpf`      | String | CPF do usuário |
| `nasc`     | String | Data de nascimento |
| `email`    | String | E-mail de contato |
| `password` | String | Senha do usuário |

> 💡 O `id` é gerado automaticamente utilizando **UUID**.

**Exemplo de usuário:**

| id                                   | nome       | cpf           | nasc       | email              |
|-------------------------------------|------------|---------------|------------|------------------|
| 123e4567-e89b-12d3-a456-426614174000 | João Silva | 123.456.789-00 | 10/10/1990 | joao@email.com   |

---

### 2. `Banco`

Representa uma conta bancária.

**Atributos:**

| Atributo  | Tipo   | Descrição |
|-----------|--------|-----------|
| `NUCONTA` | int    | Número da conta gerado aleatoriamente |
| `tipo`    | String | Tipo da conta (ex.: Conta Corrente) |
| `user`    | User   | Objeto `User` associado à conta |
| `saldo`   | double | Saldo inicial da conta |

> 💡 O campo `user` é um objeto da classe `User`.  
> 💡 O número da conta é gerado de forma aleatória usando:  
> ```java
> int NUCONTA = (int)(Math.random() * 1000);
> ```

**Exemplo de conta:**

| NUCONTA | tipo          | user         | saldo  |
|---------|---------------|--------------|--------|
| 456     | Conta Corrente | João Silva  | 100.0  |

---

## Funcionalidades

- Criar usuários com informações pessoais.  
- Abrir contas associadas a usuários.  
- Gerar automaticamente `id` do usuário e `NUCONTA`.  
- Exibir extrato e informações da conta.  



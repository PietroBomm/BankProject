#  Bank Account - Simulação de Conta Bancária  

##  Sobre o Projeto  
Este é um programa simples de simulação de conta bancária desenvolvido em **Java**. Ele permite que o usuário interaja com um menu para realizar operações bancárias, como **saque, depósito e transferência**.  

O programa também utiliza um **loop interativo** para permitir múltiplas operações sem precisar reiniciar.  

---

##  Tecnologias Utilizadas  
- **Linguagem:** Java  
- **Ferramentas:** Scanner para entrada de dados do usuário  

---

##  Funcionalidades  
Solicita o nome e o número da conta do usuário  
 Exibe um menu com opções de saque, depósito, transferência e saída  
 Permite ao usuário realizar múltiplas operações sem precisar reiniciar o programa  
 Verifica saldo antes de permitir saques e transferências  
 Pergunta se deseja continuar ou encerrar após cada operação  

---

##  Estrutura do Código  
### **1️ Entrada de Dados:**  
- O programa solicita o **nome** e o **número da conta** do usuário.  

### **2️ Menu de Operações:**  
O usuário pode escolher entre as seguintes opções:  
- **1 - Saque:** Retira um valor da conta (se houver saldo suficiente).  
- **2 - Depósito:** Adiciona um valor à conta.  
- **3 - Transferência:** Envia dinheiro para outra conta (se houver saldo suficiente).  
- **4 - Sair:** Encerra o programa.  

### **3 Loop de Repetição:**  
- O programa **não fecha após uma única operação**.  
- Após cada ação, ele pergunta se o usuário deseja continuar ou sair.  

---

##  Demonstração  
```shell
Digite seu nome: João
Digite o número da conta: 12345

********** Menu **********
Bem-vindo, João!
Número da conta: 12345
Saldo atual: R$3500.0
**************************
Operações disponíveis:
1 - Saque
2 - Depósito
3 - Transferência
4 - Sair
**************************
Digite o número da operação desejada: 1
Digite o valor do saque: 500
Saque realizado com sucesso.
Saldo atual: R$3000.0

Deseja realizar outra operação? (1 - Sim / 2 - Não)

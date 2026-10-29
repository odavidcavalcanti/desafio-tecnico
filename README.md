# DOCUMENTAÇÃO - Relatório da Solução Proposta

---
### 1. Servidores:

Para a instalação dos sistemas solicitados, utilizei a criação de duas VMs, através do Oracle VirutalBox, e nessas VMs realizei a instalação dos sistemas: 

 - Windows Server 2019 Essentials
 - Ubuntu Server  26.04.1 LTS
 
Ambos os sistemas instalados por ISOs baixadas nos sites oficiais da Microsoft e Ubuntu.

Os arquivos de instalação e códigos fonte usados ao longo do projeto, foram movidos para o Windows Server 2019 através de uma pasta compartilhada configurada na VM, usando também os recursos GuestAdditions oficiais do VirtualBox instalados no Windows Server 2019.

### 2. SQL Server, SQL Management Studios:

Conforme solicitado, foi instalado no Windows Server 2019 o banco de dados SQL Server. para essa solução, especificamente o SQL Server Express 2025, e para acesso, criação/manipulação dos bancos e dados, e execução de queries, foi utilizado o SQL Server Management 22.  Tudo através dos instaladores oficiais da Microsoft.

## 3. Banco de dados e tabelas

O banco de dados "desafio_tecnico" foi criado dentro do SQLServer, e as tabelas foram criados nos parâmetros fornecidos, seguindo a representação:

<img width="2128" height="1048" alt="image" src="https://github.com/user-attachments/assets/34fc6df7-247d-498a-840a-a170656bc064" />

Posteriormente os dados solicitados foram inseridos, e todas as queries para criação do banco, das tabelas, e da inserção dos dados podem ser consultadas no diretório [queries](https://github.com/odavidcavalcanti/desafio-tecnico/tree/main/queries "queries") do projeto.

## 4. Programas de consultas

Os programas para consulta de dados e geração de arquivos foram criados utilizando:

- **Java 21**
- Interface feita com a lib Swing do próprio Java
- Gerenciador de depêndencias e compilação Maven
- Driver e API JDBC para comunicação com o banco SQL

Ambos foram feitos utilizando o padrão de arquitetura MVC, e seguindo paradigma de orientação a objetos, seguindo a estrutura de camadas:

**Model:** Camada com a classe para representar no sistema as entidades do banco de dados. Classes de seus respectivos sistemas:

<img width="1448" height="680" alt="image" src="https://github.com/user-attachments/assets/59f9cdf1-9f9e-483e-88be-50c411aa6521" />

**View**: Camada de interface gráfica, onde foi criada uma classe implementando a interface **JFrame**, que constrói a tela para a utilização do usuário no momento da execução, e envia o evento para a camada controller.

**Controller**: Camada responsável por receber a requisição do usuário (no caso desse s sistemas o evento de clique), e acionar o serviço de geração de arquivo.

**Service**: Camada responsável por oquestrar o serviço e as regras de negócio do sistema.
Ao ter seu método chamado ela aciona o objeto DAO da entidade, constrói a String a ser gravada no arquivo TXT utilizando os dados da lista retornada da classe DAO, e ativa o utiltário de criação de TXT fornecendo a String construída.

**DAO**: Camada de acesso ao banco de dados. Nela temos a classe responsável por estabelecer a conexão com o banco de dados através do JDBC. E outra classe que usa essa conexão, por constrói e executa a query de consulta no banco de dados, mapeia as linhas das tabelas em objetos java, e retorna um ArrayList contendo esses objetos.

**Util**: Camada de utilitários. Contém a classe responsável por criar o diretório de saída, e o arquivo TXT de saída com a String fornecida pela camada Service.

**Classe Main**: Classe java responsável por executar todo o sistema.

**Representação do fluxo da aplicação**:

<img width="3000" height="1528" alt="image" src="https://github.com/user-attachments/assets/18b0db7a-48cc-4cf1-a644-87269f1898ea" />

Os fluxo está com exceções tratadas, utilizando de blocos try/catch e retorno das mensagens de erro.

Os códigos fonte dos sistemas podem ser consultados nos diretórios [codebase_report_funcionarios](https://github.com/odavidcavalcanti/desafio-tecnico/tree/main/codebase_report_funcionarios "codebase_report_funcionarios") e [codebase_report_sistemas](https://github.com/odavidcavalcanti/desafio-tecnico/tree/main/codebase_report_sistemas "codebase_report_sistemas").

## 5. Comunicação entre os servidores

Os servidores **Windows Server 2019** e **Ubuntu Server** foram configurados dentro das VM's para ter um adaptador intranet , e ips estáticos definidos nas configurações de S.O, de maneira que possam se comunicar dentro da mesma rede através de seus IPs. (Testes de pings realizados com os pacotes de dados recebidos com sucesso).

## 6. Diretório e scripts

Como solicitado, um diretório **/NicolaSec** foi criado dentro do Home do Ubuntu Server, junto com um script para a verificação do tamanho da pasta, o usuário, e as permissões. Além disso, para facilitar a execução dos programas java, dois scripts powershell foram criados para facilitar a execução.

Os scripts criados podem ser consultados no diretório [scripts](https://github.com/odavidcavalcanti/desafio-tecnico/tree/main/scripts "scripts").

## 7. Repositório e Documentação.

O **GitHub** está sendo usado para gerenciar o repositório de arquivos e códigos desse projeto, com o intuito de facilitar a consulta. E esse relatório descrevendo a estrutura, etapas e decisões tomadas nesse desafio foi feito utilizando o **Obsidian**.

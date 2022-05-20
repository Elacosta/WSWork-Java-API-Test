# WSWork-Java-API-Test
### Projeto de uma Rest API realizado com Spring.

Neste projeto foram utilizadas as seguintes libs:
- #### Lombok
  Utilizado para fazer as Annotations no Model
- #### Rest Repositories
  Utilizado para obter acesso ao servidor Tomcat
- #### Validation
   Utilizado para fazer a validação de dados, impedindo o retorno de valores nulos (Null)
- #### Spring Data JPA
  Utilizado para fazer a conexão com o banco de dados através de Annotations diretamente nos atributos das classes. 
  (Também utilizado para criar a tabela e pôr os dados na tabela do banco H2)
- #### H2 Database
  Utilizado para realizar uma prova de conceito.
- #### MySQL Driver
  Utilizado para a comunicação entre Java e Banco de dados.
- ### XAMPP 
  Utilizado para criar o banco de dados pelo PhpMyAdmin
  
  
  ### Conteúdo (20/05/2022)
  Tento deixar o código mais limpo e claro possível. Utilizando de packeges para separar os services variados de cada entidade e tentando seguir o padrão MVC mesmo
  sem a utilização do pacote View.
  Tento seguir o Clean Code o máximo que conseguir, deixando cada função e dado bem claro utilizando de nomes bem sigestivos para facilitar
  a manutenção ou correção. Cada classe criada contém Javadoc, também para facilitar a manutenção do código e correção do código.
  Sigo também o padrão de código em inglês, assim como linguagem mundial para o desenvolvimento.
  
  No codigo, encontrarão endpoints para cada classe, porém, não consegui fazer a relação entre as classes ainda pois ainda não aprendi como fazer, estou estudando
  para de alguma forma fazer esse relacionamento. Optei por commitar sem a relação pois o CRUD de 2 classes (VehicleModel | Brand) está funcional até o momento e 
  agora partirei para fazer a terceira classe (Car).
  Nesta API Rest tento demonstrar tudo o que sei sobre fazer uma API e criar seus Endpoint. Infelizmente o ponto crucial que faltou foi a conexão entre as entidades
  que, até então desconheço como fazer e estou estudando para adquirir esse conhecimento.

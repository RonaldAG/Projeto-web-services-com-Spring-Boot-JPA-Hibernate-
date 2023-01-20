# Web services com Java
<hr>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=RED&style=for-the-badge"/>
   
## Descrição do projeto
O objetivo se concentra em construir uma aplicação web utilizando Java, spring boot, h2 e jpa. 

O intuito é criar um sistema de cadastro de usuários, pedidos e produtos utilizando o protocolo HTTP rest. 

## Modelo conceitual
No modelo a seguir, temos a representação UML das entidades e relacionamentos dentro de nossa aplicação.

![image](https://user-images.githubusercontent.com/84423626/213741009-fbcc8047-4ea7-464b-b34b-4719f36713a0.png)

## Instâncias
Abaixo, temos o diagrama que representa a relação de instanciação entre as classes. 
![image](https://user-images.githubusercontent.com/84423626/213741545-f6873d24-6f1d-4e9c-b56c-07e9c0b9356d.png)

## Funcionalidades
- Funcionalidade 1: GET dos usuários, pedidos, produtos, metodos de pagamento e categoria.

- Funcionalidade 2: POST de usuários, pedidos, produtos, metodos de pagamento e categoria.

- Funcionalidade 3: DELETE de usuários, pedidos, produtos, metodos de pagamento e categoria.

- Funcionalidade 3: UPDATE (PUT) de usuários, pedidos, produtos, metodos de pagamento e categoria.

## End points

<strong> (GET) e (POST) de usuários </strong> <br>

    http://localhost:8080/users
    
<strong> (GET) usuários por id </strong> <br>

    http://localhost:8080/users/{id}
    
<strong> (PUT) e (DELETE) de um usuário </strong> <br>

    http://localhost:8080/users/{id}

Consulte os demais end points nas [classes de recursos de cada entidade.](https://github.com/RonaldAG/Projeto-web-services-com-Spring-Boot-JPA-Hibernate-/tree/main/src/main/java/com/demo/course/resources)
    

## Tecnologias utilizadas

<strong> Linguagem: </strong> <br>

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a>

<strong> Frameworks: </strong> <br>

<a href="https://spring.io.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/spring/spring-original.svg" alt="spring" width="40" height="40"/>  </a>
<a href="https://www.postman.com/" target="_blank"> <img src="https://www.logolynx.com/images/logolynx/84/84b61060699fcac2ac5e915d71ea8567.jpeg" alt="postman" width="40" height="40"/>  </a>


## Acesso ao projeto

Você pode [acessar o código fonte do projeto](https://github.com/RonaldAG/alura-stickers-api-2/tree/main/src/main/java/com/alura/technologiesapi).

## Abrir e rodar o projeto

Após baixar o projeto, você pode abrir com o `VSCode`. Para isso, na tela de launcher clique em:

- `Open an Existing Project` (ou alguma opção similar);
- Procure o local onde o projeto está e o selecione (Caso o projeto seja baixado via zip, é necessário extraí-lo antes de procurá-lo);
- Por fim clique em `OK`.
- Ao finalizar, você pode executar o App 🏆

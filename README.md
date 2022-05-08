# [`Back-End do projeto BookControl`](https://github.com/jcarloscody/angular_projeto_BookControle)


## Conceitos usados neste projeto back
>  - `Spring Data JPA`: é um framework que tem a finalidade de facilitar a criação do repositório. Antes precisávamos criar classes DAO (data access object) objetos de acesso a dados, por meio dele era realizada a persistência com o banco de dados.  O Spring Data JPA faz parte do projeto Spring Data que também tem esta finalidade de persistência de dados e possui outros projetos.
>  - `H2 Console`: criado um banco de dados em memória, apenas em tempo de compilação.
>  - `Handler Exception`: funciona como um filtro de exceções para tratar as emissões
>  - `Padrão DTO`: Data transfer object é bastante usado na linguagem java e a finalidade deste padrão é a transferência de dados para os componentes do sistema. Em síntese, é descomplexar uma entidade e agrupar atributos numa classe simples. E no presente projeto, por exemplo, o DTO de categoria tem por fim omitir os livros que se relacionam com a categoria respectiva.
>  - `Criação de perfil` no application.properties

## Dependências
> - DevTools: auxilia na compilação
> - spring-boot-starter-data-jpa: para persistência
> - spring-boot-starter-validation: para validações dos campos
> - h2: para testes

## Anotações usadas (algumas)
> - Para domínio
>   - @Entity
>   - @Id
>   - @GeneratedValue(strategy = GenerationType.IDENTITY)
>   - @JsonManagedReference
>   - @OneToMany(mappedBy = "categoria")
> - De validação
>  - @NotEmpty
>  - @Length
>  - @Valid
> - De controller
>  - @RestController
>  - @GetMapping
>  - @PostMapping
>  - @PutMapping
>  - @DeleteMapping
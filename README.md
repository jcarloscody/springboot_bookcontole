# Back-End do projeto BookControl


## Conceitos usados neste projeto back
>  - `Spring Data JPA`: é um framework que tem a finalidade de facilitar a criação do repositório. Antes precisávamos criar classes DAO (data access object) objetos de acesso a dados, por meio dele era realizada a persistência com o banco de dados.  O Spring Data JPA faz parte do projeto Spring Data que também tem esta finalidade de persistência de dados e possui outros projetos.
>  - `H2 Console`: criado um banco de dados em memória, apenas em tempo de compilação.
>  - `Handler Exception`: funciona como um filtro de exceções para tratar as emissões


## Anotações usadas
> - De domínio
>   - @Entity
>   - @Id
>   - @GeneratedValue(strategy = GenerationType.IDENTITY)
>   - @JsonManagedReference
>   - @OneToMany(mappedBy = "categoria")
> - De validação
>  - 
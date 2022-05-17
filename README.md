# Exerc�cio - Museu (Boundary, Control e Entity) - Simplificado

### Exerc�cio - Museu (Boundary, Control e Entity) � Simplificado Usando Java FX

Crie um CRUD para fazer a manuten��o de visitantes do museu, contendo o Boundary, o Control e a Entidade (BCE), vinculando os componentes gr�ficos do tipo TextField com as propriedades do aluno, contendo um bot�o para adicionar novo aluno e outro para pesquisar, conforme layout em anexo:

Crie a classe da Entidade com os atributos todos como privado 
- Visitante:
    - id        
    - nomeVisitante
    - nomeEscola
    - dataVisita (pode ser tipo Date ou LocalDate)

Crie a classe **Boundary** conforme o diagrama de classe em anexo:

- Declare os componentes gr�ficos necess�rios conforme o layout em anexo, como sendo vari�veis de inst�ncia, lembre-se que voc� n�o precisa declarar os componentes do tipo Label, desde que os crie diretamente quando forem ser adicionados no GridPane
- Escreva o c�digo do m�todo **start()** para que ele crie um objeto do tipo **GridPane** e posicione os componentes gr�ficos conforme o layout em anexo
- Fa�a a classe **Boundary** implementar a interface **EventHandle<ActiveEvent>** e sobreescreva o m�todo **handle** para acionar o m�todo **adicionar()** do **Control** quando o bot�o adicionar for pressionado, e para acionar o m�todo **pesquisar()** do **Control** quando o bot�o pesquisar for pressionado

Crie a classe **Control** escrevendo os m�todos conforme abaixo:
- **void adicionar(Visitante v)**, dever� colocar o objeto do tipo Entidade recebido como par�metro dentro do array
- **Visitante pesquisar()**, dever� procurar no array pelo nome passado como par�metro
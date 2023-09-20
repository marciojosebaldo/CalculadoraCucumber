# CalculadoraCucumber

*** Instale o plugin Cucumber for Java
File / Settings / Plugins / Cucumber for Java

*** Em src, acesse a pasta test e crie um diretório chamado resources. Dentro de resources, crie um diretório chamado features. E dentro da mesma, crie um arquivo chamado calculadora.feature
O ícone deve ser o pepino do cocumber

*** Em calaculadora.feature, crie coloque o conteúdo abaixo:

#language: pt
  Funcionalidade: testar adição na calculadora
    Cenário: adicionar dois números usando a calculadora
      Dado que eu tenho uma calculadora
      Quando eu somo 5 e 7
      Então o resultado deve ser 12

*** Na marcação em amarelo, espere surgir a lâmpada amarela e clique em Create all step definitions. Deixe Java em File type.

*** Foi criada uma nova classe na pasta java e execute o programa. O resultado será mostrado no Console do Java

*** Caso precise, o Selenium é incluído no arquivo gerado

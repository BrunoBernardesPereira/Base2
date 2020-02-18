#language: pt
Funcionalidade: Acesso ao sistema Mantis

  @login
  Esquema do Cenario: Login
    Dado que ao logar no sistema com os dados "<username>" e "<password>"
    E o login e efetuado.

    Exemplos: 
      | username        | password        |
      | bruno.alexandre | bruno@alexandre |

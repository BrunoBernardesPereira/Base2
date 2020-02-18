#language: pt
Funcionalidade: Acesso ao sistema Mantis

  @report
  Esquema do Cenario: Cadastro de uma nova Issue
    Dado que ao logar no sistema com os dados "<username>" e "<password>"
    E inicio o fluxo de registro de uma nova issue.
    E seleciono o projeto desejado.
    Entao informo os campo desejados e envio o relatorio.

    Exemplos: 
      | username        | password        |
      | bruno.alexandre | bruno@alexandre |

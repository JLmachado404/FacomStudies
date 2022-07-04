# Facom Studies

Alunos:
- Matheus Silva Oliveira
- João Lucas Silva Machado

Visão Geral:
- O software terá a obrigatoriedade de cadastro de usuários com as seguintes informações (nome, email, senha e foto(opcional)).
- A foto do perfil será uma imagem enviada da galeria do celular ou da própria câmera.
- O software terá uma tela de login para autenticar o usuário, necessitando de (usuário e senha).
- Após autenticação, o usuário poderá:
  -  visualizar conteúdos que são adicionados no app.
  -  criar, deletar e alterar anotações relacionadas aos estudos.
  -  responder questionários adicionados no app, relacionados às aulas também postadas.

Papéis:
- O software contará com apenas o papel do próprio usuário

Requisitos funcionais:
- Tanto a autenticação quanto banco de dados da aplicação são recursos do firebase
- Somente o hash das senhas são salvos no banco de dados
- O software conta apenas com usuários comuns, não existe hierarquia de usuários.
- O software possui limite de aprendizado, ou seja, as aulas serão adicionadas no software uma vez, não existe uma rotina para novos conteúdos ou uma role de usuário que trata de adição de novos conteúdos
- A seção de anotações e armazenamento de notas pertence unicamente ao usuário logado, outros usuários não devem visualizar conteúdos adicionais nesta sessão por outros usuários.
- Os quizes também serão adicionados conforme as aulas presentes na aplicação, não deve existir o quiz de alguma matéria que não foi adicionada ao aplicativo.

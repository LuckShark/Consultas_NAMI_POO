# Consultas_NAMI_POO
ALUNO: Lucas Araújo Matricula: 2215161
Última atividade de POO - aplicação para controlar a agenda de um médico do NAMI (UNIFOR).
\###STATUS

[]0) Se a aplicação for desenvolvida na forma gráfica utilizando a biblioteca javax.swing (2,0 pontos)
[x]1) Crie a classe Paciente, com seu construtor, getters e setters (0,5 Pontos)
Paciente
- Nome: String
- Sobrenome: String
- cpf: String
- telefone: String
+ mostrar()
[x]2) Crie a Classe Consulta, com seu construtor, getters e setters. Note que o construtor deve iniciar o
atributo Status com o valor 0 (zero) que indica que a consulta esta marcada. (1,0 pontos)
Consulta
- paciente: Paciente
- dia: int
- mes: int
- ano: int
- hora: int
- status: int
+ mostrar()
[x]3) Crie a classe Agenda que
[x]a) Possua um atributo ArrayList<Consulta> lista; (0,5 pontos)
[x]b) Implemente o método adicionar que deverá receber como parâmetro uma consulta. Para inserir a
consulta na lista, o método deve verificar se o dia, mês, ano e hora da consulta estão livres, caso
positivo o método adiciona a consulta a lista, caso o horário naquele dia esteja ocupado, o método
devera gerar uma exceção “Horário Ocupado” (1,0 pontos)
[x]c) Implemente o método confirmar que deverá receber como parâmetro uma consulta. Para confirmar
a consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 0 (marcada), caso positivo o método altera o status para 1 (Confirmada),
caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não encontrar a consulta, a
exceção “Consulta não encontrada” deve ser gerada. (1,0 pontos)
[x]d) Implemente o método realizar que deverá receber como parâmetro uma consulta. Para realizar a
consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 1 (confirmada), caso positivo o método altera o status para 2 (Realizada),
caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não encontrar a consulta, a
exceção “Consulta não encontrada” deve ser gerada. (1,0 pontos)
[x]e) Implemente o método cancelar que deverá receber como parâmetro uma consulta. Para cancelar a
consulta, o método deve encontrar a consulta através do dia, mês, ano e hora da consulta e verificar
se o status da consulta é 0 ou 1 (marcada ou confirmada), caso positivo o método altera o status para
3 (cancelada), caso contrário, o método devera gerar uma exceção “Status Inválido”. Se não
encontrar a consulta, a exceção “Consulta não encontrada” deve ser gerada. (1,0 pontos)
[x]f) o método listar deverá receber como parâmetro um dia, mês e ano e apresentar todas as consultas
que pertencem aquele dia, mês e ano (1,0 pontos)
[x]g) o método pesquisar deverá receber como parâmetro um cpf e apresentar todas as consultas que
pertencem aquele cpf, caso não existam consultas deverá apresentar a mensagem de consulta não
encontrada para cpf informado (1,0 pontos)

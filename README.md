# Projeto Final - Módulo Desenvolvimento Android Moderno

### Dados do Aluno
* **Nome:** [Cláudio Weberth  Oliveira Cardoso]
* **Data de Entrega:** [07/06/2026]

---

### 1. Justificativa da Escolha do Tema
Optei pelo tema **Lista de Tarefas (Task Manager)** por ser um modelo ideal e altamente focado na validação dos pilares essenciais do desenvolvimento Android moderno. Ele isola as regras de negócio de complexidades visuais externas (como consumo de APIs ou renderização de mídias pesadas), permitindo demonstrar de forma clara e limpa os fluxos de dados reativos e o cumprimento estrito da arquitetura MVVM requerida.

### 2. Descrição do Funcionamento do Aplicativo
O aplicativo gerencia afazeres diários através de duas telas dinâmicas:
1.  **Tela de Listagem (TaskListScreen):** Exibe de forma reativa e ordenada as tarefas salvas no banco de dados local. Conta com um componente `FloatingActionButton` que direciona o usuário para o fluxo de cadastro.
2.  **Tela de Cadastro (TaskDetailScreen):** Contém campos de entrada de texto estruturados (`OutlinedTextField`) para a coleta de dados de Título e Descrição. Ao acionar o botão "Salvar", os dados são persistidos de forma assíncrona.

### 3. Detalhes Técnicos e Arquiteturais
* **Interface (UI):** Desenvolvida 100% em **Jetpack Compose**, utilizando componentes do Material Design 3.
* **Navegação:** Implementada via **Navigation Compose** gerenciada centralizadamente na MainActivity através de rotas fortemente tipadas/mapeadas.
* **Persistência (Data):** Engine do **Room Database** com coroutines (`suspend functions`) e entrega de fluxos assíncronos via `Flow`.
* **Arquitetura (MVVM):** Separação total de responsabilidades. A UI não conhece a origem dos dados, apenas observa os estados (`StateFlow` e `mutableStateOf`) expostos pelas respectivas ViewModels, que por sua vez fazem a ponte com o `TaskRepository`.

# Desafio Dio - Modelagem e Diagramação de um Componente iPhone


```mermaid
classDiagram
    class iPhone {
        +ReprodutorMusical
        +AparelhoTelefonico
        +NavegadorInternet
    }

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +parar()
    }

    class AparelhoTelefonico {
        +fazerLigacoes(int)
        +receberLigacoes(int)
    }

    class NavegadorInternet {
        +abrirSite(url)
        +atualizarPagina()
    }

    iPhone o--> ReprodutorMusical
    iPhone o--> AparelhoTelefonico
    iPhone o--> NavegadorInternet

```

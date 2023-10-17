public class smartphone implements reprodutorMusical, navegadorWeb, aparelhoTelefonico{

   //reprodutorMusical
   @Override
   public String tocar(String musica){
      return "Reproduzindo a música "+musica;
   }

      public String pausar(String musica){
      return "Pausando a música "+musica;
   }

      public String selecionarMusica(String musica){
      return "Selecionando a música "+musica;
   }

   //navegadorWeb
   @Override
   public String exibirPagina(String pagina){
      return "Exibindo a página "+pagina;   
   }

   public String adicionarNovaAba(String pagina){
      return "Adicionando a página "+pagina; 
   }

   public String atualizarPagina(String pagina){
      return "Atualizando a página "+pagina;
   }

   //aparelhoTelefonico
   @Override
   public String ligar(String contato){
      return "Efetuando a ligação para "+contato;   
   }

   public String atender(String contato){
      return "Atendendo a ligação de "+contato;
   }

   public String iniciarCorreioVoz(String contato){
      return "Reproduzindo correio de voz de "+contato;
   }
   
}

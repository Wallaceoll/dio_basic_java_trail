public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // ligar ou desligar TV
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        // Aumentar ou diminuir volume da TV
        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual :" + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual :" + smartTv.volume);

        // Mudar o canal da TV
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);
    }
}

package OrcamentoMat;

import javax.swing.JOptionPane;

public class Processamento {
	public static void main(String[] args) {

		String largura = JOptionPane.showInputDialog("qual vai ser a largura da casa ");
		String comprimento = JOptionPane.showInputDialog("qual vai ser o comprimento da casa ");

		Casa casa = new Casa();
		casa.setLargura(Double.valueOf(largura));
		casa.setComprimento(Double.valueOf(comprimento));

		/* apresentar perimetro e area da casa */
		JOptionPane.showMessageDialog(null,
				"perimetro :" + casa.calcPerimetro() + "m \n" + " area : " + casa.calcArea() + " m²");

		/* atribuindo valor a paredes */

		JOptionPane.showMessageDialog(null, "\n agora vamos calcular as paredes da casa ");

		Parede parede = new Parede();

		String alturaP = JOptionPane.showInputDialog("qual a altura das paredes que você deseja fazer ?");

		casa.getParede().setAlturaP(Double.valueOf(alturaP));
		/* apresentando metragem de paredes */

		JOptionPane.showMessageDialog(null, " metragem de paredes : " + casa.metroParede()
				+ " m \n convertendo para centimetros :" + casa.cmParede() + " cm");
		/* apresentando quantos cm² tem as paredes da casa */

		/* criando e atribuindo valor aos blocos de ceramica */

		BlocoCeramico blococeramico1 = new BlocoCeramico();
		blococeramico1.setNome("bloco ceramico 6 furos 9x14x19 cm ");
		blococeramico1.setLargura(9);
		blococeramico1.setComprimento(19);
		blococeramico1.setAltura(14);
		casa.getBlocosCeramicos().add(blococeramico1);

		BlocoCeramico blococeramico2 = new BlocoCeramico();
		blococeramico2.setNome("bloco ceramico 6 furos 9x14x24 cm ");
		blococeramico2.setLargura(9);
		blococeramico2.setComprimento(24);
		blococeramico2.setAltura(14);
		casa.getBlocosCeramicos().add(blococeramico2);

		BlocoCeramico blococeramico3 = new BlocoCeramico();
		blococeramico3.setNome("bloco ceramico 8 furos 9x19x19 cm ");
		blococeramico3.setLargura(9);
		blococeramico3.setComprimento(19);
		blococeramico3.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico3);

		BlocoCeramico blococeramico4 = new BlocoCeramico();
		blococeramico4.setNome("bloco ceramico 8 furos 9x19x24 cm ");
		blococeramico4.setLargura(9);
		blococeramico4.setComprimento(24);
		blococeramico4.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico4);

		BlocoCeramico blococeramico5 = new BlocoCeramico();
		blococeramico5.setNome("bloco ceramico 8 furos 9x19x29 cm ");
		blococeramico5.setLargura(9);
		blococeramico5.setComprimento(29);
		blococeramico5.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico5);

		BlocoCeramico blococeramico6 = new BlocoCeramico();
		blococeramico6.setNome("bloco ceramico 9 furos 11,5x14x24 cm ");
		blococeramico6.setLargura(11.5);
		blococeramico6.setComprimento(24);
		blococeramico6.setAltura(14);
		casa.getBlocosCeramicos().add(blococeramico6);
		BlocoCeramico blococeramico7 = new BlocoCeramico();
		blococeramico7.setNome("bloco ceramico 9 furos 11,5x19x19 cm ");
		blococeramico7.setLargura(11.5);
		blococeramico7.setComprimento(19);
		blococeramico7.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico7);

		BlocoCeramico blococeramico8 = new BlocoCeramico();
		blococeramico8.setNome("bloco ceramico 9 furos 11,5x19x24 cm");
		blococeramico8.setLargura(11.5);
		blococeramico8.setComprimento(24);
		blococeramico8.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico8);

		BlocoCeramico blococeramico9 = new BlocoCeramico();
		blococeramico9.setNome("bloco ceramico 9 furos 11,5x19x29 cm");
		blococeramico9.setLargura(11.5);
		blococeramico9.setComprimento(29);
		blococeramico9.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico9);

		BlocoCeramico blococeramico10 = new BlocoCeramico();
		blococeramico10.setNome("bloco ceramico 12 furos 14x19x19  cm ");
		blococeramico10.setLargura(14);
		blococeramico10.setComprimento(19);
		blococeramico10.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico10);

		BlocoCeramico blococeramico11 = new BlocoCeramico();
		blococeramico11.setNome("bloco ceramico 12 furos 14x19x24 cm ");
		blococeramico11.setLargura(14);
		blococeramico11.setComprimento(24);
		blococeramico11.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico11);

		BlocoCeramico blococeramico12 = new BlocoCeramico();
		blococeramico12.setNome("bloco ceramico 12 furos 14x19x29 cm");
		blococeramico12.setLargura(14);
		blococeramico12.setComprimento(29);
		blococeramico12.setAltura(19);
		casa.getBlocosCeramicos().add(blococeramico12);

		/* agora vamos criar lista para os blocos de concreto */

		BlocoConcreto blocoConcreto1 = new BlocoConcreto();
		blocoConcreto1.setNome("bloco de concreto 11,5x19x24 cm ");
		blocoConcreto1.setLargura(11.5);
		blocoConcreto1.setComprimento(24);
		blocoConcreto1.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto1);

		BlocoConcreto blocoConcreto2 = new BlocoConcreto();
		blocoConcreto2.setNome("bloco de concreto 11,5x19x36,5 cm");
		blocoConcreto2.setLargura(11.5);
		blocoConcreto2.setComprimento(36.5);
		blocoConcreto2.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto2);

		BlocoConcreto blocoConcreto3 = new BlocoConcreto();
		blocoConcreto3.setNome("bloco de concreto 14x19x29 cm");
		blocoConcreto3.setLargura(14);
		blocoConcreto3.setComprimento(29);
		blocoConcreto3.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto3);

		BlocoConcreto blocoConcreto4 = new BlocoConcreto();
		blocoConcreto4.setNome("bloco de concreto 9x19x39 cm");
		blocoConcreto4.setLargura(9);
		blocoConcreto4.setComprimento(39);
		blocoConcreto4.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto4);

		BlocoConcreto blocoConcreto5 = new BlocoConcreto();
		blocoConcreto5.setNome("bloco de concreto 14x19x39 cm");
		blocoConcreto5.setLargura(14);
		blocoConcreto5.setComprimento(39);
		blocoConcreto5.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto5);

		BlocoConcreto blocoConcreto6 = new BlocoConcreto();
		blocoConcreto6.setNome("bloco de concreto 19x19x39 cm");
		blocoConcreto6.setLargura(19);
		blocoConcreto6.setComprimento(39);
		blocoConcreto6.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto6);

		BlocoConcreto blocoConcreto7 = new BlocoConcreto();
		blocoConcreto7.setNome("bloco de concreto 9x19x29 cm");
		blocoConcreto7.setLargura(9);
		blocoConcreto7.setComprimento(29);
		blocoConcreto7.setAltura(19);
		casa.getBlocosConcreto().add(blocoConcreto7);

		/* atribuir e criar lista de tijolo comun */

		TijoloComun tijolocomun1 = new TijoloComun();
		tijolocomun1.setNome("tijolo comun 5x10x21 cm");
		tijolocomun1.setLargura(0);
		tijolocomun1.setComprimento(0);
		tijolocomun1.setAltura(0);
		casa.getTijloscomuns().add(tijolocomun1);

		TijoloComun tijolocomun2 = new TijoloComun();
		tijolocomun2.setNome("tijolo comun 4,3x9,1x19,1 cm");
		tijolocomun2.setLargura(0);
		tijolocomun2.setComprimento(0);
		tijolocomun2.setAltura(0);
		casa.getTijloscomuns().add(tijolocomun2);

		/* criando um menu de seleção de qual material utilizar */

		String opcao = JOptionPane.showInputDialog(
				"Qual material deseja utilizar \n 1 - bloco cerâmico \n 2 - bloco de concreto \n 3 - tijolo comum \n taboa \n ");

		/* criando menu de bloco ceramico */

		switch (Integer.valueOf(opcao)) {
		case 1:
			JOptionPane.showMessageDialog(null, "o material escolhido foi bloco cerâmico ");

			String opcaoTC = JOptionPane.showInputDialog(
					"qual tijolo cerâmico você deseja usar ? \n\n 1 - bloco cerâmico 6 furos 9x14x19 cm \n 2 -bloco ceramico 6 furos 9x14x24 cm \n 3 - bloco ceramico 8 furos 9x19x19 cm \n 4 - bloco ceramico 8 furos 9x19x24 cm \n 5 - bloco ceramico 8 furos 9x19x29 cm \n 6 - bloco ceramico 9 furos 11,5x14x24 cm \n 7 - bloco ceramico 9 furos 11,5x19x19 cm \n 8 - bloco ceramico 9 furos 11,5x19x24 cm \n 9 - bloco ceramico 9 furos 11,5x19x29 cm \n 10 - bloco ceramico 12 furos 14x19x19  cm \n 11 - bloco ceramico 12 furos 14x19x24 cm \n 12 - bloco ceramico 12 furos 14x19x29 cm  ");

			switch (Integer.valueOf(opcaoTC)) {
			case 1:

				String posicaob1 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado  ");
				if (Integer.valueOf(posicaob1) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico1.getAltura() + 1) * (blococeramico1.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 6 furos 9x14x19 cm: " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob1) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico1.getComprimento() + 1) * (blococeramico1.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 6 furos 9x14x19 cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}
				break;

			case 2:

				String posicaob2 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado");
				if (Integer.valueOf(posicaob2) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico2.getAltura() + 1) * (blococeramico2.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 6 furos 9x14x24 cm: " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob2) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico2.getComprimento() + 1) * (blococeramico2.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 6 furos 9x14x24 cm: " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 3:

				String posicaob3 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob3) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico3.getAltura() + 1) * (blococeramico3.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x19 cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob3) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico3.getComprimento() + 1) * (blococeramico3.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x19 cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 4:

				String posicaob4 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob4) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico4.getAltura() + 1) * (blococeramico4.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x24 cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob4) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico4.getComprimento() + 1) * (blococeramico4.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x24 cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 5:

				String posicaob5 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado");
				if (Integer.valueOf(posicaob5) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico5.getAltura() + 1) * (blococeramico5.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x29 cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob5) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico5.getComprimento() + 1) * (blococeramico5.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 8 furos 9x19x29 cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 6:

				String posicaob6 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob6) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico6.getAltura() + 1) * (blococeramico6.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x14x24 cm: " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob6) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico6.getComprimento() + 1) * (blococeramico6.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x14x24 cm: " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 7:

				String posicaob7 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob7) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico7.getAltura() + 1) * (blococeramico7.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x19 cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob7) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico7.getComprimento() + 1) * (blococeramico7.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x19 cm : " + quantt + " unidades");
				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 8:

				String posicaob8 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob8) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico8.getAltura() + 1) * (blococeramico8.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x24 cm\": " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob8) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico8.getComprimento() + 1) * (blococeramico8.getLargura() + 1));
					int quantt = (int) quantTijolo;

					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x24 cm\": " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 9:

				String posicaob9 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob9) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico9.getAltura() + 1) * (blococeramico9.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x29 cm: " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob9) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico9.getComprimento() + 1) * (blococeramico9.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 9 furos 11,5x19x29 cm: " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 10:

				String posicaob10 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob10) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico10.getAltura() + 1) * (blococeramico10.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 12 furos 14x19x19  cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob10) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico10.getComprimento() + 1) * (blococeramico10.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 12 furos 14x19x19  cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 11:

				String posicaob11 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado ");
				if (Integer.valueOf(posicaob11) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico11.getAltura() + 1) * (blococeramico11.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 12 furos 14x19x24 cm : " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob11) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico11.getComprimento() + 1) * (blococeramico11.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null,
							"bloco ceramico 12 furos 14x19x24 cm : " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

				break;
			case 12:

				String posicaob12 = JOptionPane
						.showInputDialog("como deseja utilizar tijolo \n 1 - bloco em pé \n 2 - bloco deitado");
				if (Integer.valueOf(posicaob12) == 1) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico12.getAltura() + 1) * (blococeramico12.getComprimento() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 12 furos 14x19x29 cm: " + quantt + " unidades");

				} else if (Integer.valueOf(posicaob12) == 2) {
					double quantTijolo = casa.cmParede()
							/ ((blococeramico12.getComprimento() + 1) * (blococeramico12.getLargura() + 1));
					int quantt = (int) quantTijolo;
					JOptionPane.showMessageDialog(null, "bloco ceramico 12 furos 14x19x29 cm: " + quantt + " unidades");

				} else {
					JOptionPane.showMessageDialog(null, "opção invalida ");
				}

			default:

			}

			break;
		case 2:
			/* bloco de concreto */
			JOptionPane.showMessageDialog(null, "materia escolhido foi bloco de concreto ");
			String opcaobc = JOptionPane.showInputDialog(
					"qual tipo de bloco de concreto vc deseja utilizar \n 1 - bloco de concreto 11,5x19x24 cm \n 2 - bloco de concreto 11,5x19x36,5 cm  \n 3 - bloco de concreto 14x19x29 cm \n 4 - bloco de concreto 9x19x39 cm \n 5 - bloco de concreto 14x19x39 cm \n 6 - bloco de concreto 19x19x39 cm \n 7 - bloco de concreto 9x19x29 cm");

			switch (Integer.valueOf(opcaobc)) {
			case 1:
				double quantblococ1 = casa.cmParede()/ ((blocoConcreto1.getAltura() + 1) * (blocoConcreto1.getComprimento() + 1));
				int quanttbc1 = (int) quantblococ1;
				JOptionPane.showMessageDialog(null, "bloco de concreto 11,5x19x24 cm " + quanttbc1 + "unidades");
				break;

			case 2:
				double quantblococ2 = casa.cmParede()/ ((blocoConcreto2.getAltura() + 1) * (blocoConcreto2.getComprimento() + 1));
				int quanttbc2 = (int) quantblococ2;
				JOptionPane.showMessageDialog(null, "bloco de concreto 11,5x19x36,5 cm : " + quanttbc2 + " unidades");
				break;

			case 3:
				double quantblococ3 = casa.cmParede()/ ((blocoConcreto3.getAltura() + 1) * (blocoConcreto3.getComprimento() + 1));
				int quanttbc3 = (int) quantblococ3;
				JOptionPane.showMessageDialog(null, "bloco de concreto 14x19x29 cm : " + quanttbc3 + " unidades");
				break;

			case 4:
				double quantblococ4 = casa.cmParede()/ ((blocoConcreto4.getAltura() + 1) * (blocoConcreto4.getComprimento() + 1));
				int quanttbc4 = (int) quantblococ4;
				JOptionPane.showMessageDialog(null, "bloco de concreto 9x19x39 cm : " + quanttbc4 + " unidades");
				break;

			case 5:
				double quantblococ5 = casa.cmParede()/ ((blocoConcreto5.getAltura() + 1) * (blocoConcreto5.getComprimento() + 1));
				int quanttbc5 = (int) quantblococ5;
				JOptionPane.showMessageDialog(null, "bloco de concreto 9x19x29 cm : " + quanttbc5 + " unidades");
				break;

			case 6:
				double quantblococ6 = casa.cmParede()/ ((blocoConcreto6.getAltura() + 1) * (blocoConcreto6.getComprimento() + 1));
				int quanttbc6 = (int) quantblococ6;
				JOptionPane.showMessageDialog(null, "bloco de concreto 19x19x39 cm : " + quanttbc6 + " unidades");
				break;

			case 7:
				double quantblococ7 = casa.cmParede()/ ((blocoConcreto7.getAltura() + 1) * (blocoConcreto7.getComprimento() + 1));
				int quanttbc7 = (int) quantblococ7;
				JOptionPane.showMessageDialog(null, "bloco de concreto 9x19x29 cm : " + quanttbc7 + " unidades");
				break;

			}

			break;
		case 3:
			/*calcular tijolos comums  */
			JOptionPane.showMessageDialog(null, "material escolhido foi tijolo comum");
			String opcaotc=JOptionPane.showInputDialog("qual tijolo você deseja utilisar \n 1- tijolo comum 5x10x21 cm \n 2 - tijolo comum 4,3x9,1x19,1 cm  ");
			   if (Integer.valueOf(opcaotc )==1) {
				   double quantTc1 = casa.cmParede()/ ((tijolocomun1.getAltura() + 1) * (tijolocomun1.getComprimento() + 1));
					int quantc1 = (int) quantTc1;
					JOptionPane.showMessageDialog(null, "tijolo comum 5x10x21 cm : " + quantc1 + " unidades");
					 
			}else if(Integer.valueOf(opcaotc)==2){
				double quantTc2 = casa.cmParede()/ ((tijolocomun2.getAltura() + 1) * (tijolocomun2.getComprimento() + 1));
				int quantc2= (int) quantTc2;
				JOptionPane.showMessageDialog(null, "tijolo comum 4,3x9,1x19,1 cm : " + quantc2 + " unidades");
				
			}
			break;
		case 4:
			/*calcular quantia de taboas */
			JOptionPane.showMessageDialog(null, "o material escolhido foi taboa ");
			String larguraTaboa=JOptionPane.showInputDialog("qual e a largura das taboas que você vai utilizar ?");
			
			double quantidadeTaboa =casa.calcPerimetro()/Double.valueOf(larguraTaboa);
			JOptionPane.showMessageDialog(null, " taboas que vai utilizar nas paredes"+ quantidadeTaboa +"unidades ");
			
			break;
			
		case 5:
			System.out.println("opção invalida ");
			
		   break;	

		}

	}
}

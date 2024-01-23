import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Aplkace extends JFrame {
    private JButton btn;
    private JTextField jmeno;
    private JPanel mainPanel;
    private JTextField prijmeni;
    private JCheckBox checkGDPR;
    private JRadioButton radio1;
    private JRadioButton radio4;
    private JRadioButton radio3;
    private JRadioButton radio2;
    private JTextField datumNarozeni;
    private JTable seznamnakupu;
    private List<Zak> seznamZaku = new ArrayList<>();
    private int rocnik;
    public Aplkace() {
        seznamZaku.add(new Zak("Martin", "Novák", LocalDate.now(),true, 1, new ArrayList<Nakup>()));
        nacti(0);
        setVisible(true);
        setTitle("Gui");
        setContentPane(mainPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radio1.addActionListener(e -> zmenaStavu(1));
        radio2.addActionListener(e -> zmenaStavu(2));
        radio3.addActionListener(e -> zmenaStavu(3));
        radio4.addActionListener(e -> zmenaStavu(4));
        btn.addActionListener(e -> uloz());
    }
    public void zmenaStavu(int x){
        switch (x) {
            case 1: radio1.setSelected(true); radio2.setSelected(false); radio3.setSelected(false); radio4.setSelected(false); rocnik = 1; break;
            case 2: radio2.setSelected(true); radio1.setSelected(false); radio3.setSelected(false); radio4.setSelected(false); rocnik = 2; break;
            case 3: radio3.setSelected(true); radio2.setSelected(false); radio1.setSelected(false); radio4.setSelected(false); rocnik = 3; break;
            case 4: radio4.setSelected(true); radio2.setSelected(false); radio3.setSelected(false); radio1.setSelected(false); rocnik = 4; break;

        }
    }
    public void nacti(int x){
        jmeno.setText(seznamZaku.get(x).getJmeno());
        prijmeni.setText(seznamZaku.get(x).getPrijmeni());
        datumNarozeni.setText(seznamZaku.get(x).getDatumNarozeni().toString());
        checkGDPR.setSelected(seznamZaku.get(x).isGdpr());
        zmenaStavu(seznamZaku.get(x).getRocnik());
        seznamnakupu.addColumn(new TableColumn());
        for (Nakup n : seznamZaku.get(x).getSeznamNakupu()) {
            seznamnakupu.addColumn(new TableColumn());
        }
    }
    public void uloz(){
        try {
            seznamZaku.get(0).setJmeno(jmeno.getText());
            seznamZaku.get(0).setPrijmeni(prijmeni.getText());
            seznamZaku.get(0).setDatumNarozeni(LocalDate.parse(datumNarozeni.getText()));
            seznamZaku.get(0).setGdpr(checkGDPR.isSelected());
            seznamZaku.get(0).setRocnik(rocnik);
        }catch(DateTimeParseException e) {
            System.err.println("Nepovedlo se uložit špatně zadaný formát data");
        }
    }
}

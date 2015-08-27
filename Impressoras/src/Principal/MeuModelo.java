package Principal;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class MeuModelo extends DefaultTableCellRenderer {

    String nomeImpressoraPadrao = "";
    public MeuModelo(String nomeImpressoraPadrao) {
        this.nomeImpressoraPadrao = nomeImpressoraPadrao;
    }

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color c = null;
        
        Object text = table.getValueAt(row, 0);
        if (nomeImpressoraPadrao.equals(text.toString().trim())){
            c = Color.GREEN;
        }
        label.setBackground(c);
        label.setForeground(Color.BLACK);
        return label;
    }
}
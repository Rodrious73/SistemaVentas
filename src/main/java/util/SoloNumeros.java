package util;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class SoloNumeros {

    public static void soloNumeros(JTextField jtextfield, int maxDigitos) {
        jtextfield.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                SwingUtilities.invokeLater(() -> validarInput(de.getDocument(), maxDigitos));
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                SwingUtilities.invokeLater(() -> validarInput(de.getDocument(), maxDigitos));
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                SwingUtilities.invokeLater(() -> validarInput(de.getDocument(), maxDigitos));
            }
        });
    }

    private static void validarInput(Document document, int maxDigitos) {
        try {
            String input = document.getText(0, document.getLength());
            if (!input.matches("\\d*")) {
                document.remove(0, document.getLength());
                return;
            }
            if(input.length()> maxDigitos){
                document.remove(maxDigitos, input.length() - maxDigitos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

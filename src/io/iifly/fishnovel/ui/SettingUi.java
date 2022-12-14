package io.iifly.fishnovel.ui;

import io.iifly.fishnovel.conf.PersistentState;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class SettingUi {

    public JPanel mainPanel;

    public JLabel chooseFileLabel;
    public JTextField novelPath;
    public JButton chooseFileBtn;

    private JLabel fontSizeLabel;
    public JComboBox<String> fontSize;

    public JLabel fontTypeLabel;
    public JComboBox<String> fontType;

    public JLabel preLabel;
    public JTextField pre;

    public JLabel nextLabel;
    public JTextField next;

    public JLabel lineCountLabel;
    public JComboBox<String> lineCount;

    private JLabel bossLabel;
    private JTextField bossKey;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }


    public SettingUi() {
        // 选择文件
        chooseFileBtn.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.showOpenDialog(mainPanel);
            File file = fileChooser.getSelectedFile();
            novelPath.setText(file.getPath());
        });

        // 字号
        final DefaultComboBoxModel<String> fontSizeCbm = new DefaultComboBoxModel<>();
        for (int i = 12; i < 25; i++) {
            fontSizeCbm.addElement(String.valueOf(i));
        }
        fontSize.setModel(fontSizeCbm);

        // 字体
        final DefaultComboBoxModel<String> fontTypeCbm = new DefaultComboBoxModel<>(GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames());
        fontType.setModel(fontTypeCbm);

        // 行数
        final DefaultComboBoxModel<String> lineCountCbm = new DefaultComboBoxModel<>();
        for (int i = 1; i < 11; i++) {
            lineCountCbm.addElement(String.valueOf(i));
        }
        lineCount.setModel(lineCountCbm);

    }

    public void reload(PersistentState persistentState) {
        novelPath.setText(persistentState.getNovelPath());
        novelPath.setEditable(false);

        fontSize.setSelectedItem(persistentState.getFontSize());
        fontType.setSelectedItem(persistentState.getFontType());
        lineCount.setSelectedItem(persistentState.getLineCount());

        pre.setText(persistentState.getPre());
        pre.setEditable(false);

        next.setText(persistentState.getNext());
        next.setEditable(false);

        bossKey.setText(persistentState.getBoos());
        bossKey.setEditable(false);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
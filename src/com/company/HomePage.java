package com.company;

import java.util.ArrayList;

public class HomePage extends javax.swing.JFrame {

    largeDatabaseQueries LDB = new largeDatabaseQueries();
    int commandNum = 1;

    public HomePage() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Ugly GUI Building">
    private void initComponents() {

        TypeSelectRadio = new javax.swing.ButtonGroup();
        commandSelect = new javax.swing.JTabbedPane();
        basicSearchPanel = new javax.swing.JPanel();
        personBasicRadio = new javax.swing.JRadioButton();
        entryBasicLabel = new javax.swing.JLabel();
        movieBasicRadio = new javax.swing.JRadioButton();
        nameBasicLabel = new javax.swing.JLabel();
        nameBasicField = new javax.swing.JTextField();
        displayBasic = new javax.swing.JTabbedPane();
        peopleBasic = new javax.swing.JPanel();
        peopleBasicPanel = new javax.swing.JScrollPane();
        peopleBasicOutput = new javax.swing.JTextPane();
        writeBasic = new javax.swing.JButton();
        searchBasic = new javax.swing.JButton();
        fileNameBasicField = new javax.swing.JTextField();
        ageYearBasicLabel = new javax.swing.JLabel();
        ageYearBasicSpinner = new javax.swing.JSpinner();
        advancedSearchPanel = new javax.swing.JPanel();
        writeAdvanced = new javax.swing.JButton();
        nameAdvancedField = new javax.swing.JTextField();
        fileNameAdvancedField = new javax.swing.JTextField();
        ageYearAdvancedSpinner = new javax.swing.JSpinner();
        nameAdvancedLabel = new javax.swing.JLabel();
        searchAdvanced = new javax.swing.JButton();
        displayAdvanced = new javax.swing.JTabbedPane();
        peopleBasic2 = new javax.swing.JPanel();
        peopleBasicPanel2 = new javax.swing.JScrollPane();
        peopleBasicOutput2 = new javax.swing.JTextPane();
        personAdvancedRadio = new javax.swing.JRadioButton();
        entryAdvancedLabel = new javax.swing.JLabel();
        ageYearAdvancedLabel = new javax.swing.JLabel();
        movieAdvancedRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        baconNumPanel = new javax.swing.JPanel();
        actorLabel1 = new javax.swing.JLabel();
        actorOneField = new javax.swing.JTextField();
        displayBasic1 = new javax.swing.JTabbedPane();
        peopleBasic1 = new javax.swing.JPanel();
        peopleBasicPanel1 = new javax.swing.JScrollPane();
        peopleBasicOutput1 = new javax.swing.JTextPane();
        writeBasic1 = new javax.swing.JButton();
        fileNameBasicField1 = new javax.swing.JTextField();
        coverButton = new javax.swing.JButton();
        bestWorstButton = new javax.swing.JButton();
        typeButton = new javax.swing.JButton();
        characterField = new javax.swing.JTextField();
        nameBasicLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Database");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        TypeSelectRadio.add(personBasicRadio);
        personBasicRadio.setText("Person");
        personBasicRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personBasicRadioActionPerformed(evt);
            }
        });

        entryBasicLabel.setText("Entry Type");

        TypeSelectRadio.add(movieBasicRadio);
        movieBasicRadio.setText("Movie");
        movieBasicRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieBasicRadioActionPerformed(evt);
            }
        });

        nameBasicLabel.setText("Name");

        nameBasicField.setText("Enter name here...");

        peopleBasicOutput.setEditable(false);
        peopleBasicPanel.setViewportView(peopleBasicOutput);

        javax.swing.GroupLayout peopleBasicLayout = new javax.swing.GroupLayout(peopleBasic);
        peopleBasic.setLayout(peopleBasicLayout);
        peopleBasicLayout.setHorizontalGroup(
                peopleBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1107, Short.MAX_VALUE)
                        .addGroup(peopleBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasicLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        peopleBasicLayout.setVerticalGroup(
                peopleBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 439, Short.MAX_VALUE)
                        .addGroup(peopleBasicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasicLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        displayBasic.addTab("Output", peopleBasic);

        writeBasic.setText("Write Results to File");
        writeBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBasicActionPerformed(evt);
            }
        });

        searchBasic.setText("Search");
        searchBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBasicActionPerformed(evt);
            }
        });

        fileNameBasicField.setText("Enter file name here...");
        fileNameBasicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameBasicFieldActionPerformed(evt);
            }
        });

        ageYearBasicLabel.setText("Age/Year");

        javax.swing.GroupLayout basicSearchPanelLayout = new javax.swing.GroupLayout(basicSearchPanel);
        basicSearchPanel.setLayout(basicSearchPanelLayout);
        basicSearchPanelLayout.setHorizontalGroup(
                basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basicSearchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, basicSearchPanelLayout.createSequentialGroup()
                                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ageYearBasicLabel)
                                                        .addComponent(nameBasicLabel)
                                                        .addComponent(nameBasicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(movieBasicRadio)
                                                        .addComponent(personBasicRadio))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(basicSearchPanelLayout.createSequentialGroup()
                                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(displayBasic, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, basicSearchPanelLayout.createSequentialGroup()
                                                                .addComponent(entryBasicLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, basicSearchPanelLayout.createSequentialGroup()
                                                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(searchBasic)
                                                                        .addComponent(ageYearBasicSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(writeBasic, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(fileNameBasicField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap())))
        );

        basicSearchPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fileNameBasicField, writeBasic});

        basicSearchPanelLayout.setVerticalGroup(
                basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basicSearchPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(entryBasicLabel)
                                .addGap(17, 17, 17)
                                .addComponent(personBasicRadio)
                                .addGap(19, 19, 19)
                                .addComponent(movieBasicRadio)
                                .addGap(24, 24, 24)
                                .addComponent(nameBasicLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameBasicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(ageYearBasicLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicSearchPanelLayout.createSequentialGroup()
                                                .addComponent(fileNameBasicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basicSearchPanelLayout.createSequentialGroup()
                                                .addComponent(ageYearBasicSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)))
                                .addGroup(basicSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(writeBasic)
                                        .addComponent(searchBasic))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBasic, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        commandSelect.addTab("Basic Search", basicSearchPanel);

        writeAdvanced.setText("Write Results to File");
        writeAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeAdvancedActionPerformed(evt);
            }
        });

        nameAdvancedField.setText("Enter name here...");

        fileNameAdvancedField.setText("Enter file name here...");
        fileNameAdvancedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameAdvancedFieldActionPerformed(evt);
            }
        });

        nameAdvancedLabel.setText("Name");

        searchAdvanced.setText("Search");
        searchAdvanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAdvancedActionPerformed(evt);
            }
        });

        peopleBasicOutput2.setEditable(false);
        peopleBasicPanel2.setViewportView(peopleBasicOutput2);

        javax.swing.GroupLayout peopleBasic2Layout = new javax.swing.GroupLayout(peopleBasic2);
        peopleBasic2.setLayout(peopleBasic2Layout);
        peopleBasic2Layout.setHorizontalGroup(
                peopleBasic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1107, Short.MAX_VALUE)
                        .addGroup(peopleBasic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasic2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        peopleBasic2Layout.setVerticalGroup(
                peopleBasic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 439, Short.MAX_VALUE)
                        .addGroup(peopleBasic2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasic2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        displayAdvanced.addTab("Output", peopleBasic2);

        TypeSelectRadio.add(personAdvancedRadio);
        personAdvancedRadio.setText("Person");
        personAdvancedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personAdvancedRadioActionPerformed(evt);
            }
        });

        entryAdvancedLabel.setText("Entry Type");

        ageYearAdvancedLabel.setText("Age/Year");

        TypeSelectRadio.add(movieAdvancedRadio);
        movieAdvancedRadio.setText("Movie");
        movieAdvancedRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieAdvancedRadioActionPerformed(evt);
            }
        });

        jLabel1.setText("Advanced Parameters");

        jLabel2.setText("Variable Type");

        jLabel3.setText("Condition");

        jTextField1.setText("value...");

        jLabel6.setText("Comparable");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Age", "Year", "Name", "Genre" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<", ">", "==", "!=", "<=", ">=" }));

        javax.swing.GroupLayout advancedSearchPanelLayout = new javax.swing.GroupLayout(advancedSearchPanel);
        advancedSearchPanel.setLayout(advancedSearchPanelLayout);
        advancedSearchPanelLayout.setHorizontalGroup(
                advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(displayAdvanced)
                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                                .addComponent(entryAdvancedLabel)
                                                                .addGap(430, 430, 430)
                                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel2)
                                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(34, 34, 34)
                                                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(37, 37, 37)
                                                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel6)))))
                                                        .addComponent(ageYearAdvancedLabel)
                                                        .addComponent(nameAdvancedLabel)
                                                        .addComponent(nameAdvancedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(movieAdvancedRadio)
                                                        .addComponent(personAdvancedRadio))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(searchAdvanced)
                                                        .addComponent(ageYearAdvancedSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(writeAdvanced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fileNameAdvancedField, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        advancedSearchPanelLayout.setVerticalGroup(
                advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(entryAdvancedLabel)
                                                .addGap(17, 17, 17)
                                                .addComponent(personAdvancedRadio)
                                                .addGap(19, 19, 19)
                                                .addComponent(movieAdvancedRadio)
                                                .addGap(24, 24, 24))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, advancedSearchPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addGap(36, 36, 36)
                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, advancedSearchPanelLayout.createSequentialGroup()
                                                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                                .addComponent(nameAdvancedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameAdvancedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(ageYearAdvancedLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(advancedSearchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                .addComponent(ageYearAdvancedSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(searchAdvanced))
                                        .addGroup(advancedSearchPanelLayout.createSequentialGroup()
                                                .addComponent(fileNameAdvancedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(writeAdvanced)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayAdvanced, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        commandSelect.addTab("Advanced Search", advancedSearchPanel);

        actorLabel1.setText("Actor Name");

        actorOneField.setText("Enter name here...");

        peopleBasicOutput1.setEditable(false);
        peopleBasicPanel1.setViewportView(peopleBasicOutput1);

        javax.swing.GroupLayout peopleBasic1Layout = new javax.swing.GroupLayout(peopleBasic1);
        peopleBasic1.setLayout(peopleBasic1Layout);
        peopleBasic1Layout.setHorizontalGroup(
                peopleBasic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1107, Short.MAX_VALUE)
                        .addGroup(peopleBasic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasic1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        peopleBasic1Layout.setVerticalGroup(
                peopleBasic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 439, Short.MAX_VALUE)
                        .addGroup(peopleBasic1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peopleBasic1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(peopleBasicPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        displayBasic1.addTab("Output", peopleBasic1);

        writeBasic1.setText("Write Results to File");
        writeBasic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeBasic1ActionPerformed(evt);
            }
        });

        fileNameBasicField1.setText("Enter file name here...");
        fileNameBasicField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameBasicField1ActionPerformed(evt);
            }
        });

        coverButton.setText("Cover Roles");
        coverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverButtonActionPerformed(evt);
            }
        });

        bestWorstButton.setText("Best of Days, Worst of Days");
        bestWorstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestWorstButtonActionPerformed(evt);
            }
        });

        typeButton.setText("Typecasting");
        typeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeButtonActionPerformed(evt);
            }
        });

        characterField.setText("Enter name here...");

        nameBasicLabel4.setText("Character (optional)");

        javax.swing.GroupLayout baconNumPanelLayout = new javax.swing.GroupLayout(baconNumPanel);
        baconNumPanel.setLayout(baconNumPanelLayout);
        baconNumPanelLayout.setHorizontalGroup(
                baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(displayBasic1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baconNumPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(writeBasic1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(fileNameBasicField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(actorOneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(actorLabel1)
                                                        .addComponent(bestWorstButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(coverButton)
                                                        .addComponent(characterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nameBasicLabel4))
                                                .addGap(463, 463, 463))
                                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                                .addComponent(typeButton)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        baconNumPanelLayout.setVerticalGroup(
                baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                                .addComponent(actorOneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(79, 79, 79))
                                        .addGroup(baconNumPanelLayout.createSequentialGroup()
                                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nameBasicLabel4)
                                                        .addComponent(actorLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(characterField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addGroup(baconNumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coverButton)
                                                        .addComponent(bestWorstButton))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(fileNameBasicField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(writeBasic1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBasic1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        commandSelect.addTab("Advanced Queries", baconNumPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1159, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(commandSelect, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 966, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(commandSelect, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>

    private void formMouseClicked(java.awt.event.MouseEvent evt) {
        return;
    }
    private void fileNameBasicField1ActionPerformed(java.awt.event.ActionEvent evt) {
        return;
    }
    private void personAdvancedRadioActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.personOrMovie = true;
    }
    private void fileNameAdvancedFieldActionPerformed(java.awt.event.ActionEvent evt) {
        return;
    }
    private void fileNameBasicFieldActionPerformed(java.awt.event.ActionEvent evt) {
        return;
    }

    // Function to select search type
    private void personBasicRadioActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.personOrMovie = true;
    }

    // Write to file for Basic Search
    private void writeBasicActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.fileName = fileNameBasicField.getText();
    }

    // Write to file for Advanced Search
    private void writeAdvancedActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.fileName = fileNameAdvancedField.getText();
        System.out.println(DatabaseUI.fileName);
    }

    // Write to file for Advanced uery
    private void writeBasic1ActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.fileName = fileNameBasicField1.getText();
    }

    // Basic search button
    // TODO: Check for errors
    private void searchBasicActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.actorName1 = nameBasicField.getText();
        DatabaseUI.ageOrYear = (Integer) ageYearBasicSpinner.getValue();

        // String hackery to trick our processQuery function to work with GUI input
        String fakeLine = "command" + commandNum + " <- " + "select " + "name == " + DatabaseUI.actorName1;
        String temp2;

        if (DatabaseUI.ageOrYear > 0)
            fakeLine += " && age == " + DatabaseUI.ageOrYear + " )";

        if (DatabaseUI.personOrMovie) {
            temp2 = "people";
        }
        else {
            fakeLine.replace("age", "year");
            temp2 = "movies";
        }
        String[] temp = fakeLine.split(" ");
        ArrayList<String> fakeQuery = new ArrayList<String>();
        for(String val: temp) {
            fakeQuery.add(val);
        }

        DatabaseUI.output = QueryCommands.processQuery(DBMS.postfix(fakeQuery), temp2).toString();
        peopleBasicOutput.setText(DatabaseUI.output);
    }

    private void movieBasicRadioActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.personOrMovie = true;
    }

    private void movieAdvancedRadioActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.personOrMovie = false;
    }

    // Advanced search button
    // TODO: Add function and output to screen, inputs handled
    private void searchAdvancedActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.actorName1 = nameAdvancedField.getText();
        DatabaseUI.ageOrYear = (Integer) ageYearAdvancedSpinner.getValue();
        DatabaseUI.comparator = jTextField1.getText();
        DatabaseUI.operator = jComboBox2.getSelectedIndex();
        DatabaseUI.compareType = jComboBox1.getSelectedIndex();

    }

    // TODO: Add functionality
    private void bestWorstButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.actorName1 = actorOneField.getText();
    }

    // TODO: Add output
    private void typeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.actorName1 = actorOneField.getText();
        DatabaseUI.output = LDB.mostOccurrencesInGenre(DBMS.getPersonByName(DatabaseUI.actorName1));

    }

    // TODO: Add functionality
    private void coverButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DatabaseUI.characterName = characterField.getText();
    }


    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (you really don't want to open this) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    //<editor-fold defaultstate="collapsed" desc="Variable declarations for GUI, open if you want a laugh">
    private javax.swing.ButtonGroup TypeSelectRadio;
    private javax.swing.JLabel actorLabel1;
    private javax.swing.JTextField actorOneField;
    private javax.swing.JPanel advancedSearchPanel;
    private javax.swing.JLabel ageYearAdvancedLabel;
    private javax.swing.JSpinner ageYearAdvancedSpinner;
    private javax.swing.JLabel ageYearBasicLabel;
    private javax.swing.JSpinner ageYearBasicSpinner;
    private javax.swing.JPanel baconNumPanel;
    private javax.swing.JPanel basicSearchPanel;
    private javax.swing.JButton bestWorstButton;
    private javax.swing.JTextField characterField;
    private javax.swing.JTabbedPane commandSelect;
    private javax.swing.JButton coverButton;
    private javax.swing.JTabbedPane displayAdvanced;
    private javax.swing.JTabbedPane displayBasic;
    private javax.swing.JTabbedPane displayBasic1;
    private javax.swing.JLabel entryAdvancedLabel;
    private javax.swing.JLabel entryBasicLabel;
    private javax.swing.JTextField fileNameAdvancedField;
    private javax.swing.JTextField fileNameBasicField;
    private javax.swing.JTextField fileNameBasicField1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton movieAdvancedRadio;
    private javax.swing.JRadioButton movieBasicRadio;
    private javax.swing.JTextField nameAdvancedField;
    private javax.swing.JLabel nameAdvancedLabel;
    private javax.swing.JTextField nameBasicField;
    private javax.swing.JLabel nameBasicLabel;
    private javax.swing.JLabel nameBasicLabel4;
    private javax.swing.JPanel peopleBasic;
    private javax.swing.JPanel peopleBasic1;
    private javax.swing.JPanel peopleBasic2;
    private javax.swing.JTextPane peopleBasicOutput;
    private javax.swing.JTextPane peopleBasicOutput1;
    private javax.swing.JTextPane peopleBasicOutput2;
    private javax.swing.JScrollPane peopleBasicPanel;
    private javax.swing.JScrollPane peopleBasicPanel1;
    private javax.swing.JScrollPane peopleBasicPanel2;
    private javax.swing.JRadioButton personAdvancedRadio;
    private javax.swing.JRadioButton personBasicRadio;
    private javax.swing.JButton searchAdvanced;
    private javax.swing.JButton searchBasic;
    private javax.swing.JButton typeButton;
    private javax.swing.JButton writeAdvanced;
    private javax.swing.JButton writeBasic;
    private javax.swing.JButton writeBasic1;
    //</editor-fold>
}
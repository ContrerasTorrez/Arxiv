package org.model;

import java.time.LocalDateTime;

public class EntryModel {
    String id; // "http://arxiv.org/abs/cond-mat/0102536v1"
    String title;// "Impact of Electron-Electron Cusp on Configuration Interaction Energies"
    String summary; // "The effect of the electron-electron cusp on the convergence of configuration [...] "
    LocalDateTime updated; // = 2001-02-28T20:12:09Z
    LocalDateTime published; // = date("2001-02-28T20:12:09Z")
    String doi; // = string("10.1063/1.1383585")
    String comment; // = string("11 pages, 6 figures, 3 tables, LaTeX209, submitted to The Journal of Chemical Physics")
    String journal_ref; // = string("J. Chem. Phys. 115, 1626 (2001)")
    String link_pdf; // = string("http://arxiv.org/pdf/cond-mat/0102536v1")
}

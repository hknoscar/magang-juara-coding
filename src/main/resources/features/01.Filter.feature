Feature: Halaman Contact Message WJC
  Scenario: Menampilkan from contact message
    Given Admin open web
    When Admin login web juara coding
    And Admin klik tombol contact messages
    And Admin pilih filter nama
    Then Admin get tombol nama

  Scenario: Menampilkan data filter email
    When Admin pilih filter email
    Then Admin get tombol email

  Scenario: Menampilkan data filter phone number
    When Admin pilih filter phone number
    Then Admin get tombol phone number

  Scenario: Menampilkan data filter subject
    When Admin pilih filter subject
    Then Admin get tombol subject

  Scenario: Menampilkan data filter message
    When Admin pilih filter message
    Then Admin get tombol message


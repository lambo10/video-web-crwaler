import numpy as np
import MySQLdb
def divide_sent(txt,vidLink,botNameHH):
 from nltk.tokenize import sent_tokenize
 sent_tokenize_list = sent_tokenize(txt)
 len(sent_tokenize_list)
 print (sent_tokenize_list)
 sentencesA = np.asarray(sent_tokenize_list)
 count = 0
 while count < 3:
  print (sentencesA[count])
  conn = MySQLdb.connect(host='localhost',
                         user='root',
                         passwd='lambert88',
                         db='maxialertH')
  x = conn.cursor()
  add_salary = ('INSERT INTO test_SE_db'
                '(sentence, link, botName) '
                'VALUES (%(emp_sent)s, %(emp_link)s, %(emp_botName)s)')
  data_salary = {
      'emp_sent': sentencesA[count],
      'emp_link': vidLink,
      'emp_botName': botNameHH,
  }

  x.execute(add_salary,data_salary)
  conn.commit()
  x.close()
  conn.close()

  count = count + 1

divide_sent('doawnload pirates of the carribian here. you can click the btn to doawnload. index page','http://localhost/pingee/pirateC.mp4','jk')
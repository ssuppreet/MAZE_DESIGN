String csvSplitBy = " ";
			int [][]digits = new int[150][5];
			int i = 0,k = 0,l = 0;
			BufferedReader fin = null;
				try
				{
					fin = new BufferedReader(new FileReader("CreateMaze.txt"));
					String ch;
					while((ch = fin.readLine()) != null)
					{
						String []part = ch.split(csvSplitBy);
						for(int a = 0 ; a < part.length; a++)
						{
							digits[i][a]=Integer.parseInt(part[a]);
						}
						i++;
					}
				}

				catch(FileNotFoundException e)
				{
				System.out.println(e);
				}
				catch(IOException e)
				{
				System.out.println(e);
				}
				finally
				{
					if(fin != null)
					{
						try
						{
							fin.close();
						}
						catch(IOException e)
						{
							e.printStackTrace();
						}
					}
				}